<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.sawan.spring.springmvc.dto.Employee, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Employee> emps = (List<Employee>) request.getAttribute("employeeList");
	for (Employee e : emps) {
		out.println(e.getId() + " ");
		out.print(e.getName() + " ");
		out.print(e.getSalary() + " ---> ");
	}
	%>
</body>
</html>
