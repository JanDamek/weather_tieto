<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Weather service for Tieto</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/screen.css"/>" />
</head>

<body>
	<div id="container">
		<div class="dualbrand">
			<img src="<c:url value="/static/resources/gfx/dualbrand_logo.png"/>" />
		</div>
		<div id="content">
			<h1>Weather</h1>
			<div>
				<img
					src="<c:url value="/static/resources/gfx/dualbrand_as7eap.png"/>" />
				<p>Weather for location</p>
				<h3>Location: ${location}</h3>
				Current weather for location: ${weather.location}<br/>
			</div>
		</div>
		<div id="aside">
			<p>Learn more about JBoss Enterprise Application Platform 6.</p>
			<ul>
				<li><a href="http://red.ht/jbeap-6-docs">Documentation</a></li>
				<li><a href="http://red.ht/jbeap-6">Product Information</a></li>
			</ul>
			<p>Learn more about JBoss AS 7.</p>
			<ul>
				<li><a
					href="https://docs.jboss.org/author/display/AS7/Getting+Started+Developing+Applications+Guide">Getting
						Started Developing Applications Guide</a></li>
				<li><a href="http://jboss.org/jbossas">Community Project
						Information</a></li>
			</ul>
		</div>
		<div id="footer">
			<p>
				This project was generated from a Maven archetype from JBoss.<br />
			</p>
		</div>
	</div>

</body>
</html>