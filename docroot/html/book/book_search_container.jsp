<%@page import="com.lib.model.Book"%>
<%@page import="com.test.BookNameComparator"%>
<%@page import="com.lib.service.BookLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="init.jsp"%>

<div class="separator"></div>
<liferay-portlet:renderURL varImpl="bookSearchURL">
	<portlet:param name="mvcPath"
		value="/html/book/book_search_container.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%=bookSearchURL %>" method="get" name="bookForm">
	<liferay-portlet:renderURLParams varImpl="bookSearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="title" value="<%= title %>" />
		<portlet:param name="description" value="<%= description %>" />
		<portlet:param name="mvcPath"
			value="/html/book/book_search_container.jsp" />
	</liferay-portlet:renderURL>

	<liferay-ui:search-container
		displayTerms="<%= new DisplayTerms(renderRequest) %>"
		emptyResultsMessage="there-are-no-books"
		headerNames="title,description" iteratorURL="<%= iteratorURL %>">
		<liferay-ui:search-form page="/html/book/book_search.jsp"
			servletContext="<%= application %>" />
		<liferay-ui:search-container-results>
			<%
				DisplayTerms displayTerms = searchContainer.getDisplayTerms();
				if (displayTerms.isAdvancedSearch()) {
					total = BookLocalServiceUtil.getSearchBooksCount(title, description, displayTerms.isAndOperator());
					searchContainer.setTotal(total);
					searchContainer.setResults(BookLocalServiceUtil.getSearchBooks(title, description, displayTerms.isAndOperator(), searchContainer.getStart(), searchContainer.getEnd(), new BookNameComparator()));
				} else {
					String searchkeywords = displayTerms.getKeywords();
					String numbesearchkeywords = Validator.isNumber(searchkeywords) ? searchkeywords : String.valueOf(0);
					total = BookLocalServiceUtil.getSearchBooksCount(title, description, displayTerms.isAndOperator());
					searchContainer.setResults(BookLocalServiceUtil.getSearchBooks(searchkeywords, searchkeywords, false, searchContainer.getStart(), searchContainer.getEnd(), new BookNameComparator()));
				}
				
		%>
		</liferay-ui:search-container-results>
		<liferay-ui:search-container-row className="Book" keyProperty="bookId"
			modelVar="currentBook">
			<liferay-portlet:renderURL varImpl="rowURL">
				<portlet:param name="backURL" value="<%= currentURL %>" />
				<portlet:param name="mvcPath" value="/html/book/view.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="bookId"
					value="<%= String.valueOf(currentBook.getBookId()) %>" />
			</liferay-portlet:renderURL>

			<liferay-ui:search-container-column-text href="<%= rowURL %>"
				name="title" property="title" />

			<liferay-ui:search-container-column-text href="<%= rowURL %>"
				name="description" property="description" />

		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
	</liferay-ui:search-container>
</aui:form>
