<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<h1>Category</h1>
	<form method="post" action="addCategory">
		<h2>Add category</h2>
		<p>${massageCategory}</p>
		<table border="0">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
				<td><input type="submit" value="Ok" /></td>
			</tr>
		</table>
	</form>
</body>
</html>