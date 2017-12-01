package com.test;

import com.lib.model.Book;
import com.liferay.portal.kernel.util.OrderByComparator;

public class BookNameComparator extends OrderByComparator {
	public static final String ORDER_BY_ASC = "Book_.title ASC";
	  public static final String ORDER_BY_DESC = "Book_.title DESC";
	  public static final String[] ORDER_BY_FIELDS = { "title" };
	  private boolean _ascending;
	  
	  public BookNameComparator() { this(false); }
	  
	  public BookNameComparator(boolean ascending)
	  {
	    _ascending = ascending;
	  }
	  
	  public int compare(Object obj1, Object obj2)
	  {
	    Book book1 = (Book) obj1;
	    Book book2 = (Book) obj2;
	    
	    String title1 = book1.getTitle();
	    String title2 = book2.getTitle();
	    
	    int value = title1.compareTo(title2);
	    
	    if (_ascending) {
	      return value;
	    }
	    
	    return -value;
	  }
	  

	  public String getOrderBy()
	  {
	    if (_ascending) {
	      return "Book_.title ASC";
	    }
	    
	    return "Book_.title DESC";
	  }
	  

	  public String[] getOrderByFields()
	  {
	    return ORDER_BY_FIELDS;
	  }
	  
	  public boolean isAscending()
	  {
	    return _ascending;
	  }
}
