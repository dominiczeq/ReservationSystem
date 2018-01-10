<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="jspf/head_config.jspf" %>
<%@ include file="jspf/header.jspf" %>

<%-- 
<p>Book list</p>

	<c:forEach items="${availableBooks}" var="book">
		<c:out value="${book.title}"></c:out></br>
	</c:forEach>

${book}</br>
	--%>

<h3 class="header">Lista rezerwacji</h3>

	<c:forEach items="${availableReservation}" var="reservation">
		<c:out value="${reservation}"/> 
		<a href="${pageContext.request.contextPath}/reservation/${hairdresser.id}/del">Usuń</a>
		<br/>
	</c:forEach>
	
	
	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>

<%@ include file="jspf/footer.jspf" %>