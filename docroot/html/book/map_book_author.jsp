<%@page import="com.lib.model.Author"%>
<%@page import="com.lib.service.AuthorLocalServiceUtil"%>
<%@page import="com.lib.model.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.lib.service.BookLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ include file="init.jsp" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>

<%
	PortletURL mapAuthorToBookActionURL = renderResponse.createActionURL();
	mapAuthorToBookActionURL.setParameter(ActionRequest.ACTION_NAME, "mapBookAuthor");
%>

<h1>Map Multiple Authors to One Book</h1>
<aui:form action="<%= mapAuthorToBookActionURL.toString() %>" method="post" name="authorForm" id="authorForm">
<aui:select name="bookId" label="Book Title">

<%
List<Book> bookList = BookLocalServiceUtil.getBooks(0, BookLocalServiceUtil.getBooksCount());
for(Book book : bookList) {
%>
	<aui:option value="<%=book.getBookId()%>" label="<%=book.getTitle()%>"></aui:option>
<%
}%>

</aui:select>
<%

List<Author> authorList = AuthorLocalServiceUtil.getAuthors(0, AuthorLocalServiceUtil.getAuthorsCount());
for(Author author: authorList) {
%>
	<aui:input name="courses" label="<%=author.getName()%>" value="<%=author.getAuthorId()%>" type="checkbox"></aui:input>
<%
}
%>
<aui:input name="selectedAuthorsHidden" id="selectedAuthorsHidden" type="hidden" value="" />
<aui:button-row>
<aui:button type="button" name="saveAuthors" id="saveAuthors" value="Map Authors To Book"/>
</aui:button-row>

<aui:script>
AUI().use('aui-base', function(A) {
A.one('#<portlet:namespace/>saveAuthors').on('click', function(event){ 
// alert("==");
 var selectedAuthorIds = "";
 A.one('#<portlet:namespace/>authorForm').all('input[type=checkbox]').each(function () {
    if(this.get('checked')) {
 		selectedAuthorIds = this.get('value') + ";" + selectedAuthorIds;
	}
 });
 A.one('#<portlet:namespace />selectedAuthorsHidden').set("value", selectedAuthorIds.trim());
 console.log(selectedAuthorIds);	
 document.<portlet:namespace />authorForm.submit();
 });
});
</aui:script>
</aui:form>
