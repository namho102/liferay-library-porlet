<%@ include file="init.jsp"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>

 
<portlet:defineObjects />

<%
	PortletURL addBookActionURL = renderResponse.createActionURL();
	addBookActionURL.setParameter(ActionRequest.ACTION_NAME, "addBook");
%>

<h2>Add New Book</h2>


<aui:form action="<%=addBookActionURL.toString()%>"
	name="bookForm" method="POST">

	<aui:input name="title">
		<aui:validator name="required" />
	</aui:input>

	<aui:input name="description"></aui:input>

	<aui:input name="imageUrl"></aui:input>
	
	<aui:select name="category">
	    <aui:option value="Fiction">Fiction</aui:option>
	    <aui:option value="Drama">Drama</aui:option>
	    <aui:option value="Self help">Self help</aui:option>
	    <aui:option value="Guide">Guide</aui:option>
	    <aui:option value="Science">Science</aui:option>
	    <aui:option value="History">History</aui:option>
	    <aui:option value="Comics">Comics</aui:option>    
	</aui:select>
	

	<aui:button type="submit" name="" value="Submit"></aui:button>

</aui:form>

