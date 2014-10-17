<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dim.jolim.model.Curso"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Curso</title>
</head>
<body>
<h1>Detalhes Curso</h1>
<%
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	List<Curso> cursos = (List<Curso>)request.getAttribute("cursos");
%>
<table>
	<tr>
		<th>Nome</th>
		<th>Data início:</th>
		<th>Data fim:</th>
	</tr>
	<% for (Curso curso : cursos) {%>
	<tr>
		<td><%=curso.getNome()%></td>
		<td><%=sdf.format(curso.getDataInicio()) %></td>
		<td><%=sdf.format(curso.getDataFim()) %></td>
		<td><a href="curso?id=<%=curso.getId()%>">Detalhar</a></td>
	</tr>
	<% } %>
</table>
<a href="index.jsp" >Menu Principal</a>

</body>
</html>