<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@page import="com.liferay.portal.util.PortalUtil" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>


<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:renderURL var="homeURL">
</portlet:renderURL>
<portlet:renderURL var="addBookUrl">
	<portlet:param name="mvcPath" value="/html/book/add_book.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="mapAuthorsToBookUrl">
	<portlet:param name="mvcPath" value="/html/book/map_book_author.jsp"/>
</portlet:renderURL>

<portlet:renderURL var="searchUrl">
	<portlet:param name="mvcPath" value="/html/book/book_search_container.jsp"/>
</portlet:renderURL>

<%

String currentURL = PortalUtil.getCurrentURL(request);
String title = ParamUtil.getString(request, "title");
String description = ParamUtil.getString(request, "description");

%>


<div class="body_nav">
	<aui:a href="<%=homeURL%>" label="Home"></aui:a>
	<aui:a href="<%=addBookUrl%>" label="Add Book"></aui:a>
	<aui:a href="<%=mapAuthorsToBookUrl%>" label="Map Authors to Book"></aui:a>
	<aui:a href="<%=searchUrl%>" label="Search"></aui:a>
<br/>
	
</div>

