<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
DisplayTerms displayTerms = searchContainer.getDisplayTerms();

String title = ParamUtil.getString(request, "title");
String description = ParamUtil.getString(request, "description");

%>

<liferay-ui:search-toggle
	buttonLabel="Search Book"
	displayTerms="<%= displayTerms %>"
	id="toggle_id_book_search">
	<aui:input label="Title" name="title" value="<%=title%>" />
	<aui:input label="Description" name="description" value="<%=description%>" />
</liferay-ui:search-toggle>