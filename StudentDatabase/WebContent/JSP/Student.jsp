<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="stud"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: skyblue">

	<h1 style="text-align: center;">Student MarkList</h1>
	<hr>
	<table
		style="border: 2px solid; margin-left: 350px; margin-top: 30px; font-size: 22px;">
		<thead>
			<tr>
				<th style="border: 2px solid;">Student id</th>
				<th style="border: 2px solid;">Student Name</th>
				<th style="border: 2px solid;">Maths</th>
				<th style="border: 2px solid;">English</th>
				<th style="border: 2px solid;">Malayalam</th>
				<th style="border: 2px solid;">Social</th>
				<th style="border: 2px solid;">Science</th>
				<th style="border: 2px solid;">Total</th>
			</tr>
		</thead>

		<tbody>
		<stud:forEach var="student" items="${listStudent}">
			<tr>
				
					<td style="border: 2px solid; font-size: 20px;">${student.id }</td>
					<td style="border: 2px solid; font-size: 20px;">${student.name }</td>
					<td style="border: 2px solid; font-size: 20px;">${student.maths }</td>
					<td style="border: 2px solid; font-size: 20px;">${student.english }</td>
					<td style="border: 2px solid; font-size: 20px;">${student.malayalam }</td>
					<td style="border: 2px solid; font-size: 20px;">${student.social }</td>
					<td style="border: 2px solid; font-size: 20px;">${student.science }</td>
					<td style="border: 2px solid; font-size: 20px;">${student.total }</td>
			
			</tr>
				</stud:forEach>
		</tbody>
	</table>
</body>
</html>