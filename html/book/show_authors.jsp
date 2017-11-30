<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.lib.model.impl.AuthorImpl"%>
<%@page import="com.lib.model.impl.BookImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.lib.service.AuthorLocalServiceUtil"%>
<%@page import="com.lib.service.BookLocalServiceUtil"%>
<%@page import="com.lib.model.Book"%>
<%@page import="com.lib.model.Author"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>

<%
	ResultRow currentRow = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Book book = (Book)currentRow.getObject();

	List<Author> bookAuthorsList = AuthorLocalServiceUtil.getBookAuthors(book.getBookId()); 


	for(int i = 0; i < bookAuthorsList.size(); i++) {
		Object obj = bookAuthorsList.get(i);
		JSONObject jobj = JSONFactoryUtil.createJSONObject(obj.toString());
		out.println(jobj.getString("name"));
		out.println("<br/>");
	}   

%>
