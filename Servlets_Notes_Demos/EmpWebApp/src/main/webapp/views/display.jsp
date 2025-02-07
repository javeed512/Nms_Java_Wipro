<%@ page language="java"  import="java.util.* , com.wipro.ems.pojo.*"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to Display JSP Page</h1>

  
  
  <%
  
  List<Employee> empList  = (List<Employee>)	session.getAttribute("empList");
  
  
  	out.print(empList);
  
  %>


</body>
</html>