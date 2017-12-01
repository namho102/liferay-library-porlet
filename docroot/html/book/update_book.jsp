<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ include file="init.jsp"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@page import="com.lib.model.Book"%>
<%@page import="com.lib.service.BookLocalServiceUtil"%>

 
<portlet:defineObjects />

<%
	PortletURL updateBookActionURL = renderResponse.createActionURL();
	updateBookActionURL.setParameter(ActionRequest.ACTION_NAME, "updateBook");
	
	long bookId = ParamUtil.getLong(request, "bookId");
	Book book = BookLocalServiceUtil.getBook(bookId);
	
	List listOfOptions = Arrays.asList("Fiction", "Drama", "Self help", "Guide", "Science", "History", "Comics");
%>

<h2>Update Book</h2>


<aui:form action="<%=updateBookActionURL.toString()%>"
	name="bookForm" method="POST">
	
	<aui:input name="bookId" value="<%=bookId%>" type="hidden"></aui:input>
	<aui:input name="title" value="<%=book.getTitle()%>">
		<aui:validator name="required"  />
	</aui:input>

	<aui:input name="description" value="<%=book.getDescription()%>" ></aui:input>

	<aui:input name="imageUrl" value="<%=book.getImageUrl()%>" ></aui:input>
	
	<aui:select name="category">
		<%for(int i = 0; i < listOfOptions.size(); i++){ 
	        Object option = listOfOptions.get(i);
	        boolean selected = false;
	        if(option.equals(book.getCategory())){
	            selected = true;
	        } %>
	        <aui:option label="<%=option %>" value="<%=option %>" selected="<%=selected %>" />
	    <%} %>  
	</aui:select>
	

	<aui:button type="submit" name="" value="Submit"></aui:button>

</aui:form>

