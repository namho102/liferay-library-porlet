package com.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.lib.model.Book;
import com.lib.model.Author;
import com.lib.service.BookLocalServiceUtil;
import com.lib.service.AuthorLocalServiceUtil;

/**
 * Portlet implementation class BookPortlet
 */
public class BookPortlet extends MVCPortlet {
	
	public void mapBookAuthor(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException, SystemException {

		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		String selectedAuthorsHidden = ParamUtil.getString(actionRequest, "selectedAuthorsHidden");
		
//		System.out.println(bookId);
//		System.out.println(authorIdList);
		
		List<String> authorIdList = Arrays.asList(selectedAuthorsHidden.split("\\s*;\\s*"));
		

		long[] authorIds = new long[authorIdList.size()];

		int i = 0;
		for(String authorId: authorIdList) {
			authorIds[i++] = Long.parseLong(authorId);
		}
		
//		for(i = 0; i < authorIdList.size(); i++) {
//			System.out.print(authorIds[i] + " ");
//		}
//		System.out.println(authorIdList);
//		System.out.println(authorIds.toString());
		AuthorLocalServiceUtil.addBookAuthors(bookId, authorIds);
		
		
		//actionResponse.setRenderParameter("mvcPath", "/html/book/view.jsp");

	}
	
	public void addBook(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException, SystemException {

		long bookId;

		bookId = CounterLocalServiceUtil.increment();

		String title = ParamUtil.getString(actionRequest, "title");
		String description = ParamUtil.getString(actionRequest, "description");
		String imageUrl = ParamUtil.getString(actionRequest, "imageUrl");
		String category = ParamUtil.getString(actionRequest, "category");
//		String authors = ParamUtil.getString(actionRequest, "authors");

		Book book = null;
		
		book = BookLocalServiceUtil.createBook(bookId);
		book.setBookId(bookId);
		book.setTitle(title);
		book.setDescription(description);
		book.setImageUrl(imageUrl);
		book.setCategory(category);

		BookLocalServiceUtil.addBook(book);

		actionResponse.setRenderParameter("mvcPath", "/html/book/view.jsp");

	}
	
	public void deleteBook(ActionRequest actionRequest, ActionResponse actionResponse)	throws IOException, PortalException, SystemException {
		long bookId = ParamUtil.getLong(actionRequest, "bookId");
		System.out.println(bookId);
		BookLocalServiceUtil.deleteBook(bookId);
		actionResponse.setRenderParameter("mvcPath", "/html/book/view.jsp");
	}
}
