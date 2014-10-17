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
	Curso curso = (Curso)request.getAttribute("curso");
	String mensagem = (String)request.getAttribute("mensagem");	
	if (mensagem != null && !mensagem.isEmpty()) {
%>
	<span style="color:green;font-weight:bold"><%=mensagem%></span>
<%		
	}
%>
<table>
	<tr>
		<td>Nome:</td>
		<td><%=curso.getNome()%></td>
	</tr>
	<tr>
		<td>Data início:</td>
		<td><%=sdf.format(curso.getDataInicio()) %></td>
	</tr>
	<tr>
		<td>Data fim:</td>
		<td><%=sdf.format(curso.getDataFim()) %></td>
	</tr>
</table>
<a href="index.jsp" >Menu Principal</a>

</body>
</html>