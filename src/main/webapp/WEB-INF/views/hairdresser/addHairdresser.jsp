<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../jspf/head_config.jspf" %>
<%@ include file="../jspf/header.jspf" %>

<h3 class="header">Podaj dane nowego fryzjera: </h3>

	<form:form method="post" modelAttribute="hairdresser">
	
	Imię: <form:input path="name" type="text"/> <form:errors path="name"/> <br/>
	Nazwisko: <form:input path="surname" type="text"/> <form:errors path="surname"/> <br/>
	
		<input type='submit'/><br/>
		

	</form:form>
	
</body>
</html>