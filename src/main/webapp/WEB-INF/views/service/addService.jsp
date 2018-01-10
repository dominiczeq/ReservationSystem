<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../jspf/head_config.jspf" %>
<%@ include file="../jspf/header.jspf" %>

<h3 class="header">Podaj dane nowej usługi i czas: </h3>

	<form:form method="post" modelAttribute="service">
	
	Nazwa usługi: <form:input path="serviceName" type="text"/> <form:errors path="serviceName"/> <br/>
	Czas trwania usługi: <form:input path="time" type="number"/> <form:errors path="time"/> <br/>
	
		<input type='submit'/><br/>
		

	</form:form>
	
</body>
</html>