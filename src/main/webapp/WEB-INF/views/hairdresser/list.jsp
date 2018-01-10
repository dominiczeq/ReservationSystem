<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../jspf/head_config.jspf" %>
<%@ include file="../jspf/header.jspf" %>

<%-- 
<p>Book list</p>

	<c:forEach items="${availableBooks}" var="book">
		<c:out value="${book.title}"></c:out></br>
	</c:forEach>

${book}</br>
	--%>

<h3 class="header">Lista fryzjerów</h3>

	<c:forEach items="${availableHairdresser}" var="hairdresser">
		<c:out value="${hairdresser}"/> 
		<a href="${pageContext.request.contextPath}/hairdresser/${hairdresser.id}/del">Usuń</a>
		<br/>
	</c:forEach>
	
	
	<button><a href="/ReservationSystem/">Powrót do strony głównej</a></button>

<%@ include file="../jspf/footer.jspf" %>