<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="jspf/head_config.jspf" %>
<%@ include file="jspf/header.jspf" %>

<script>
$(document).ready (function() {
    $(document).attr("title", "Nowa rezerwacja");
});
</script>

<h3 class="header">Nowa rezerwacja: </h3>

Wprowadź dane niezbędne do dokonania rezerwacji:

	<form:form method="post" modelAttribute="reservation">
	
	Imię i nazwisko: <form:input path="clientName" type="text"/> <form:errors path="clientName"/> <br/>
	Nr telefonu: <form:input path="phoneNumber" type="text"/> <form:errors path="phoneNumber"/> <br/>
	
	Usługa:<form:select path="service">
			<form:options  items="${availableService}"
							itemValue="id"
							itemLabel="serviceName"/>
			</form:select><form:errors path="service"/> <br/>
	
	Fryzjer:<form:select path="hairdresser">
			<form:options  items="${availableHairdresser}"
							itemValue="id"
							itemLabel="fullName"/>
			</form:select><form:errors path="hairdresser"/> <br/>
	
			Data wizyty: <form:input path="dateService" type="date"/>  <form:errors path="dateService"/><br/>
			
		<input type='submit'/><br/>
		
	</form:form>
	
	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>


	<%@ include file="jspf/footer.jspf" %>