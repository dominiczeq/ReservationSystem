<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../jspf/head_config.jspf" %>
<%@ include file="../jspf/header.jspf" %>

	<h3 class="header">Usługi dostępne w systemie rezerwacyjnym:</h3>

	
	<Table border="1">
				<tr>
				
					<th>Id</th>
					<th>Usługa</th>
					<th>Czas usługi</th>
						
				</tr>
				<c:forEach var="d" items="${availableService}">
					<tr>

						<td>${d.id}</td>
						<td>${d.serviceName}</td>
						<td>${d.time}</td>
						
						<td><a href="${pageContext.request.contextPath}/service/${d.id}/del">Usuń</a></td>

					</tr>
				</c:forEach>
			</Table>
	
	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>
	
<%@ include file="../jspf/footer.jspf" %>