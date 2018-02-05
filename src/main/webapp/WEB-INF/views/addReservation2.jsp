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

Dane wprowadzone:
<br/><br/>
Imię i nazwisko osoby rezerwującej:${reservation.clientName }
<br/>
Numer telefonu: ${reservation.phoneNumber }
<br/>
Usługa: ${reservation.service.serviceName }
<br/>
Fryzjer: ${reservation.hairdresser.fullName }
<br/>
<br/>

	<form:form method="post" action="addReservation2" modelAttribute="reservation">
			<br/>
			
 			<form:select path="startTimeService">
	 			<c:forEach items="${potencialTimes}" var="i">
					<form:option value="${i}">
					${i}
					</form:option>
				</c:forEach>
			</form:select> 
			
					<br/>
			
		<input type='submit'/><br/>
	</form:form>
	
		<br/>
	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>

	<%@ include file="jspf/footer.jspf" %>