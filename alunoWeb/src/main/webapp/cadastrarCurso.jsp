<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo Curso</title>
</head>
<body>
<h1> Novo Curso</h1>
<%
	String mensagem = (String)request.getAttribute("mensagem");	
	if (mensagem != null && !mensagem.isEmpty()) {
%>
	<span style="color:red;font-weight:bold"><%=mensagem%></span>
<%		
	}
%>

<form action="curso" method="post">
	<table>
		<tr>
			<td>Nome:</td>
			<td><input type="text" name="nome"/></td>
		</tr>
		<tr>
			<td>Data início:</td>
			<td><input type="text" name="dataInicio"/></td>
		</tr>
		<tr>
			<td>Data fim:</td>
			<td><input type="text" name="dataFim"/></td>
		</tr>
	</table>
	<input type="submit" value="Salvar"/>
</form>
</body>
</html>