<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../jspf/head_config.jspf" %>
<%@ include file="../jspf/header.jspf" %>


<h3 class="header">Lista fryzjerów</h3>

<Table border="1">
				<tr>
				
					<th>Id</th>
					<th>Fryzjer</th>
					
						
				</tr>
				<c:forEach var="d" items="${availableHairdresser}">
					<tr>

						<td>${d.id}</td>
						<td>${d.fullName}</td>
						
						
						<td><a href="${pageContext.request.contextPath}/hairdresser/${d.id}/del">Usuń</a></td>

					</tr>
				</c:forEach>
			</Table>
	
	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>

<%@ include file="../jspf/footer.jspf" %>