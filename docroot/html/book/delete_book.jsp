<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.lib.model.Book"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />


<%
PortletURL deleteBookActionURL = renderResponse.createActionURL();
deleteBookActionURL.setParameter(ActionRequest.ACTION_NAME, "deleteBook");

ResultRow currentRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Book book = (Book)currentRow.getObject();

%>

<a href="<%= deleteBookActionURL + "&" + renderResponse.getNamespace() + "bookId="+ book.getBookId() %>" class="danger">Delete</a>