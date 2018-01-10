<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../jspf/head_config.jspf" %>
<%@ include file="../jspf/header.jspf" %>

	<h3 class="header">Usługi dostępne w systemie rezerwacyjnym:</h3>

	<c:forEach items="${availableService}" var="service">
		<c:out value="${service}" />
		<a href="${pageContext.request.contextPath}/service/${service.id}/del">Usuń</a>
		<br/>
	</c:forEach>
	
	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>
	
<%@ include file="../jspf/footer.jspf" %>