<%@ page language= "java" contentType = "text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
<title> YSL From JSP</title>
</head>
<%

System.out.println(request.getParameter("boof")); //is printed to console on each refresh. thus console is output for server side?
java.util.Date date = new java.util.Date(); //would have to manually import or do this instead



//body is where boof is created as a variable name, this is expression code. Do not include logic within jsps
//jsp is for view. take something and show it
//boof was never a secure expression since it is visible in the url... until we use form

%>



<div> Current date is <%=date%></div>
<body>
My first JSP


<form action="/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>
Name: <input type="text" name="boof"/> Password: <input type="password" name="password"/> <input type="submit" value="login"/>
</form>

</body>
</html>