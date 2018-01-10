<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>


<%@	taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Lista usług</title>
</head>
<body>

	<h3>Usługi dostępne w systemie rezerwacyjnym:</h3>

	<c:forEach items="${availableService}" var="service">
		<c:out value="${service}" />
		<a href="${pageContext.request.contextPath}/service/${service.id}/del">Usuń</a>
		<br/>
	</c:forEach>

</body>
</html>