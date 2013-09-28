<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<p>Add User to database:</p>
	<form action="addUser" method="post">
		<p>Name: <input type="text" name="name"></p>
		<p>E-mail: <input type="text" name="email"></p>
		<p>Phone: <input type="text" name="phone"></p>
		<p>Login: <input type="text" name="login"></p>
		<p>Pass: <input type="password" name="pass"></p>
		<input type="submit" value="ok">
	</form>
	<p>Get User by ID:</p>
	<form action="getUserById" method="post">
		<p>ID: <input type="text" name="id"></p>
		<input type="submit" value="ok">
	</form>
	<p>Get User by Login Password:</p>
	<form action="getUserByLogPass" method="post">
		<p>Login: <input type="text" name="login"></p>
		<p>Pass: <input type="password" name="pass"></p>
		<input type="submit" value="ok">
	</form>
	
	<p>Delete User by ID:</p>
	<form action="deleteUserById" method="post">
		<p>ID: <input type="text" name="id"></p>
		<input type="submit" value="ok">
	</form>
	
	<p>Get All User:</p>
	<form action="getUserList" method="post">
		<input type="submit" value="ok">
	</form>
</body>
</html>