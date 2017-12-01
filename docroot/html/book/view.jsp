<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.lib.model.Book"%>
<%@page import="com.lib.service.BookLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp"%>
<%@page import="javax.portlet.ActionRequest"%>

<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/book/view.jsp");

%>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-records-is-available"  deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
		<liferay-ui:search-container-results >
		<%
			results = BookLocalServiceUtil.getBooks(searchContainer.getStart(), searchContainer.getEnd());
			total = BookLocalServiceUtil.getBooksCount();
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="Book" keyProperty="bookId" modelVar="book"  rowVar="curRow" escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text name="ID" property="bookId" />
		<liferay-ui:search-container-column-text name="Title" property="title" />
		<liferay-ui:search-container-column-text name="Description" property="description" />
		<liferay-ui:search-container-column-text name="Image URL" property="imageUrl" />
		<liferay-ui:search-container-column-text name="Category" property="category" />
		<liferay-ui:search-container-column-jsp path="/html/book/show_authors.jsp" align="right" name="Authors"/>
		<liferay-ui:search-container-column-jsp path="/html/book/delete_book.jsp" name=""/>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>


