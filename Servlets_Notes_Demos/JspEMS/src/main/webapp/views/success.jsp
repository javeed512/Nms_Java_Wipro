<%@ page language="java"  isELIgnored="false"  import="com.wipro.pojo.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>Success JSP Page</h1>
  
  <!--  JSP Scriplet -->
  JSP SCRIPLET: <BR>
  <% 
  
 Employee emp  = (Employee) session.getAttribute("e1");
  	
  	out.print(emp);
  
  // add model and dbutil class in jsp project and call addEmp(emp)
  %>
  <br>
  
  JSP EXPRESSION:
  <br>
  
  <!-- JSP Expression -->
  <%=  session.getAttribute("e1") %>
  
  <br>
  
  JSP Action Tag:
  <br>
  
   <jsp:useBean id="e1"  class="com.wipro.pojo.Employee"  scope="session"></jsp:useBean>
  
  <jsp:getProperty property="eid" name="e1"/>
    <jsp:getProperty property="ename" name="e1"/>
      <jsp:getProperty property="salary" name="e1"/>
  
  
  
  <br>
  EL - Expression 
  
  ${ e1  }
  
  

</body>
</html>