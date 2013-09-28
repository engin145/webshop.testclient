<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Good</title>
</head>
<body>
	<h1>Good</h1>
	<div style="border: 1px solid #000; padding: 10px; width: 300px; margin: 10px">
	<p><b>Add good:</b></p>
	<form:form action="addGood" method="post" modelAttribute="goodReqOp" >
		<p>name: <form:input path="name" /></p>
		<p>description: <form:input path="description" /></p>
		<p>category_id: <form:input path="category_id" /></p>
		<p>manufacturers_id: <form:input path="manufacturers_id" /></p>
		<p>amount: <form:input path="amount" /></p>
		<p>units_id: <form:input path="units_id" /></p>
		<input type="submit" value="submit" />
	</form:form>
	</div>
	<div style="border: 1px solid #000; padding: 10px; width: 300px; margin: 10px">
	<p><b>get good by id:</b></p>
	<form action="getGoodById" method="post">
	<p>id: <input type="text" name="id"></input></p>
	<input type="submit" value="submit" />
	</form>
	</div>
	
	<div style="border: 1px solid #000; padding: 10px; width: 300px; margin: 10px">
	<p><b>get good by id category:</b></p>
	<form action="getGoodByCategoryID" method="post">
	<p>id: <input type="text" name="id"></input></p>
	<input type="submit" value="submit" />
	</form>
	</div>
	
	<div style="border: 1px solid #000; padding: 10px; width: 300px; margin: 10px">
	<p><b>remove good by id:</b></p>
	<form action="removeGoodById" method="post">
	<p>id: <input type="text" name="id"></input></p>
	<input type="submit" value="submit" />
	</form>
	</div>
	
	<div style="border: 1px solid #000; padding: 10px; width: 300px; margin: 10px">
	<p><b>update good:</b></p>
	<form:form action="updateGood" method="post" modelAttribute="goodReqOp" >
		<p>id: <form:input path="id" /></p>
		<p>name: <form:input path="name" /></p>
		<p>description: <form:input path="description" /></p>
		<p>category_id: <form:input path="category_id" /></p>
		<p>manufacturers_id: <form:input path="manufacturers_id" /></p>
		<p>amount: <form:input path="amount" /></p>
		<p>units_id: <form:input path="units_id" /></p>
		<input type="submit" value="submit" />
	</form:form>
	</div>
	
	
	
</body>
</html>