<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<%
		Integer id_ = (Integer) request.getAttribute("id");
	String name_ = (String) request.getAttribute("name");
	Integer salary_ = (Integer) request.getAttribute("salary");

	out.println("ID: " + id_);
	out.println("Name: " + name_);
	out.println("Salary: " + salary_);
	%>

	<br>
	<br>
	Id:
	<b>${id}</b>
	<br>
	Name:
	<b>${name}</b>
	<br>
	Salary:
	<b>${salary}</b>

</body>
</html>
