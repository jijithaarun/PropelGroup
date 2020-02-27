<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body style="background-color: skyblue">
<form action="<%=request.getContextPath()%>/StudentServlet?action=insert" method="post">
<h1 style="text-align: center;"> Register Student Details</h1>
<hr>
<form action="<%=request.getContextPath()%>/StudentServlet?action=insert" method="post">
<table style="margin-left: 500px; font-size: 22px;">
<tr>
<td>Name</td><td><input type="text" name="studentname"></td>
</tr>
<tr>
<td>Maths</td><td><input type="text" name="maths"></td>
</tr>
<tr>
<td>Malayalam</td><td><input type="text" name="malayalam"></td>
</tr>
<tr>
<td>English</td><td><input type="text" name="english"></td>
</tr>
<tr>
<td>Science</td><td><input type="text" name="science"></td>
</tr>
<tr>
<td>Social</td><td><input type="text" name="social"></td>
</tr>


</table>
<button style="margin-left: 630px; ">Save</button>
</form>
</body>

</html>
