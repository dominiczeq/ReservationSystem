<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="jspf/head_config.jspf" %>
<%@ include file="jspf/header.jspf" %>

  <h2 class="main">Strona główna</h2>

  <p>
  	Treść story tytułowej
  	<br/>
	Od czegoś trzeba zacząć ;)
	<br/>
	</p>
	
		<a href="${pageContext.request.contextPath}/service/addform" class="href">Dodaj usługę</a>
	<br/>
		<a href="service/list" class="href">Lista usług</a>
	<br/>
		<a href="hairdresser/addform" class="href">Dodaj pracownika</a>
	<br/>
		<a href="hairdresser/list" class="href">Lista pracowników</a>
  <br/>

<%@ include file="jspf/footer.jspf" %>