<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
	<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dodaj fryzjera</title>
</head>
<body>

<p>Podaj dane nowego fryzjera: </p>

	<form:form method="post" modelAttribute="hairdresser">
	
	Imię: <form:input path="name" type="text"/> <form:errors path="name"/> <br/>
	Nazwisko: <form:input path="surname" type="text"/> <form:errors path="surname"/> <br/>
	
		<input type='submit'/><br/>
		

	</form:form>

${hairdresser}<br/>
	
</body>
</html>