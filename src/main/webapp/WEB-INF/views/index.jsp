<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
			<h1>Welcome to JBoss!</h1>

			<div>
				<p>You have successfully deployed a Spring MVC web application.</p>
				<h3>Your application can run on:</h3>
				<img
					src="<c:url value="/static/resources/gfx/dualbrand_as7eap.png"/>" />
			</div>

			<h2>Weather status</h2>
			<table class="simpletablestyle">
				<thead>
					<tr>
						<th>Max r/min</th>
						<th>Max r/day</th>
						<th>Request in minute</th>
						<th>Request in day</th>
						<th>Last request</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${status.maxCountInMinute}</td>
						<td>${status.maxCountInDay}</td>
						<td>${status.countInLastMinute}</td>
						<td>${status.countInLastDayOfYear}</td>
						<td>${status.lastRequest}</td>
					</tr>
				</tbody>
			</table>
			<table class="simpletablestyle">
				<tr>
					<td>REST URL for all members: <a
						href="<c:url value="/rest/members"/>">/rest/members</a>
					</td>
				</tr>
			</table>


			<form:form action="newLocation" commandName="newLocation"
				id="regLocation">
				<h2>Location Registration</h2>
				<p>Enforces annotation-based constraints defined on the model
					class.</p>
				<table>
					<tbody>
						<tr>
							<td><form:label path="location">Location:</form:label></td>
							<td><form:input path="location" /></td>
							<td><form:errors class="invalid" path="location" /></td>
						</tr>
						<tr>
							<td><form:label path="city">City:</form:label></td>
							<td><form:input path="city" /></td>
							<td><form:errors class="invalid" path="city" /></td>
						</tr>
						<tr>
							<td><form:label path="state">State:</form:label></td>
							<td><form:input path="state" /></td>
							<td><form:errors class="invalid" path="state" /></td>
						</tr>
						<tr>
							<td><form:label path="enabled">Enabled:</form:label></td>
							<td><form:input path="enabled" /></td>
							<td><form:errors class="invalid" path="enabled" /></td>
						</tr>
					</tbody>
				</table>
				<table>
					<tr>
						<td><input type="submit" value="Add new location"
							class="register" /></td>
					</tr>
				</table>
			</form:form>
			<h2>Locations</h2>
			<c:choose>
				<c:when test="${locations.size()==0}">
					<em>No locations.</em>
				</c:when>
				<c:otherwise>
					<table class="simpletablestyle">
						<thead>
							<tr>
								<th>Location</th>
								<th>City</th>
								<th>State</th>
								<th>Updated on</th>
								<th>Weather</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${locations}" var="location">
								<tr>
									<td>${location.location}</td>
									<td>${location.city}</td>
									<td>${location.state}</td>
									<td>${location.last_update}</td>
									<td><a
										href="<c:url value="/www/weather/${location.location}"/>">weather
											detail</a></td>
							</c:forEach>
						</tbody>
					</table>
				</c:otherwise>
			</c:choose>

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
