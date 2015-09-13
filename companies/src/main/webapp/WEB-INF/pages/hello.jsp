<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
	<head>
	    <title>Microservices Intro</title>
	    <link rel="shortcut icon" href="/favicon.ico" />
	    <spring:url value="resources/css/main.css" var="css"/>
	    <link href="${css}" rel="stylesheet"/>
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	</head>
	<body>
		<!-- Banner -->
		<section id="banner">
			<h2><strong>${message}</strong> built using Java, JSP, HTML, CSS and JavaScript</h2>
			<p>Brought to you by David Ogbonnah and Gareth Andrews</p>
			<ul class="icons">
				<li><a href="https://twitter.com/MrDavi_D" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
				<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
				<li><a href="https://instagram.com/MrDavi_D" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
				<li><a href="https://www.github.com/dogbonnahNB" class="icon fa-github"><span class="label">Github</span></a></li>
			</ul>
			<ul class="actions">
				<li><a href="#two" class="button special">Get started</a></li>
			</ul>
		</section>
		
		<!-- One -->
		<section id="one" class="wrapper special">
			<div class="inner">
				<header class="major">
					<h2>More about us</h2>
				</header>
				<div class="features">
					<div class="feature">
						<i class="fa fa-diamond"></i>
						<h3>${qualityHeader}</h3>
						<p>${qualityMessage}</p>
					</div>
					<div class="feature">
						<i class="fa fa-paper-plane-o"></i>
						<h3>${pleaHeader}</h3>
						<p>${pleaMessage} <p>
					</div>
					<div class="feature">
						<i class="fa fa-envelope-o"></i>
						<h3>${contactHeader}</h3>
						<p>${contactMessage} <p>
					</div>
				</div>
			</div>
		</section>
		
		<section id="two" class= "wrapper">
			<div class="inner">
				<div class="row">
					<div class="6u 12u$(small)">
					<header>
					<h2 id="elements">${profileHeader}</h2>
					<p>${profileMessage}</p>
					</header>
					</div>
					<div class="6u 12u$(small)">
						<div class="table-wrapper">
								<table>
									<thead>
										<tr>
											<th>First Name</th>
											<th>Surname</th>
											<th>Salary</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${employees}" var="employee">
											<tr>
												<td><c:out value="${employee.firstName}" /></td>
							                    <td><c:out value="${employee.lastName}" /></td>
							                    <td><fmt:formatNumber value="${employee.salary}" type="currency" currencySymbol="£"/></td>
							                </tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
							<c:url var="empUrl" value="/hello"/>
							<form:form modelAttribute="empForm" action="${empUrl}" method="POST">
								<div class="row uniform">
									<div class="6u 12u$(xsmall)">
										<form:input type="text" path="firstName" placeholder="First Name"/>
									</div>
									<div class="6u 12u$(xsmall)">
										<form:input type="text" path="lastName" placeholder="Surname"/>
									</div>
									<div class="6u$ 12u$(xsmall)">
										<form:input type="number" path="salary" placeholder="Salary"/>
									</div>
									<div class="12u$">
										<ul class="actions">
											<li><input type="submit" value="add"/></li>
											<li><input type="reset" value="reset" class="alt" /></li>
										</ul>
									</div>
								</div>
							</form:form>
							<p>${confirmation}</p>
					</div>
				</div>
			</div>
			
			<div class= "inner">	
				<div class="features">
						<div class="feature">
							<img src= "resources/images/activemq.png" width ="75%">
						</div>
						<div class="feature">
							<img src= "resources/images/spring.png" width ="75%">
						</div>
						<div class="feature">
							<img src= "resources/images/java_ee.png" width ="75%">
						</div>
						<div class="feature">
							<img src= "resources/images/wildfly.jpeg" width = "75%">
						</div>
						<div class="feature">
							<img src= "resources/images/mysql.png" >
						</div>
				</div>
			</div>
		</section>

		
		<!-- Footer -->
		<footer id="footer">
			<div class="copyright">
				&copy;®Dave&Gaz. Design: <a href="http://templated.co/">TEMPLATED</a>.
			</div>
		</footer>
	
		<!-- Scripts -->
			<script src="resources/js/jquery.min.js"></script>
			<script src="resources/js/skel.min.js"></script>
			<script src="resources/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="resources/js/main.js"></script>
		
	</body>
</html>