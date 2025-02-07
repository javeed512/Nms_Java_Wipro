<%@ page language="java" import="java.util.* , java.io.* , java.sql.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to JSP</h1>
	HELLO FRIENDS

	<!-- JSP Scriplet -->
	<%
	int x = 99;
	out.print("X value is : " + x);

	int eid;

	List<String> list = new ArrayList<String>();
	%>

	<!-- JSP Expression -->
	<br> X value is JSP EXP :
	<%=x + 100%>

	<!-- JSP Declarations -->

	<%!int eid;
	static String ename;

	public void m1() {

	}%>





</body>
</html>