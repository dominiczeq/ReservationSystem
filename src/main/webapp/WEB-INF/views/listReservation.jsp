<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="jspf/head_config.jspf" %>
<%@ include file="jspf/header.jspf" %>

<h3 class="header">Lista rezerwacji</h3>

<Table border="1">
				<tr>

					<th>Id rezerwacji</th>
					<th>Imię i nazwisko kienta</th>
					<th>Nr telefonu</th>
					<th>Fryzjer</th>
					<th>Usługa</th>
					<th>Data usługi</th>
					<th>Godzina rezerwacji </th>
					<th>Usuń</th>
					
				</tr>
				<c:forEach var="d" items="${availableReservation}">
					<tr>

						<td>${d.id}</td>
						<td>${d.clientName}</td>
						<td>${d.phoneNumber}</td>
						<td>${d.hairdresser.fullName}</td>
						<td>${d.service}</td>
						<td>${d.dateService}</td>
						<td>${d.startTimeService}</td>
						<td><a href="${pageContext.request.contextPath}/reservation/${d.id}/del">Usuń</a></td>

					</tr>
				</c:forEach>
			</Table>

	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>

<%@ include file="jspf/footer.jspf" %>