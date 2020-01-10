<%@ page language= "java" contentType = "text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content= "text/html; charset=UTF-8">
<title> Welcome From JSP</title>
</head>
<body>
Welcome ${HELL}

<form action="/toDo.do" method="post">
To Do List Entry: <input type="text" name="doEntry"/>
</form>


Get These Done!

<p><font color="black">${tbd}</font></p>

<form action="/toDo.do" method="post">
Remove a completed task: <input type="text" name="remove"/>
</form>

</body>
</html>


<!-- Valid user -> welcome.jsp -->
<!-- invalid user -> login.jsp -->