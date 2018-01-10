<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<%@ include file="jspf/head_config.jspf" %>

<title>Strona główna</title>
</head>

<body>
<%@ include file="jspf/header.jspf" %>

<h3 class="main">Strona główna</h3>

  <p>
  	Treść story tytułowej
  	<br/>
	Od czegoś trzeba zacząć ;)
	<br/>
	</p>
	
		<a href="service/addform" class="href">Dodaj usługę</a>
	<br/>
		<a href="service/list" class="href">Lista usług</a>
	<br/>
		<a href="hairdresser/addform" class="href">Dodaj pracownika</a>
	<br/>
		<a href="hairdresser/list" class="href">Lista pracowników</a>
  <br/>



<%@ include file="jspf/footer.jspf" %>

</body>
</html>