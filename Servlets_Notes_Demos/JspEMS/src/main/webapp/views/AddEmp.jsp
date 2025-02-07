<%@ page language="java"  import="com.wipro.pojo.*"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>ADD EMPLOYEE JSP CONTROLLER PAGE</h1>
 
 
 <jsp:useBean id="e1"  class="com.wipro.pojo.Employee"  scope="session"></jsp:useBean>
 
	<%-- 
	<jsp:setProperty property="eid" name="e1"  param="eid"/> 
	<jsp:setProperty property="ename" name="e1"  param="ename"/> 
	<jsp:setProperty property="salary" name="e1"  param="salary"/> 
 --%>

		<jsp:setProperty property="*" name="e1" /> 

 <jsp:include page="success.jsp"></jsp:include>


</body>
</html>