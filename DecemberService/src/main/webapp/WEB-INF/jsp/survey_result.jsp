<%@page import="com.client.vo.loudnessVO"%>
<%@page import="com.client.clientClass.decemberClient"%>
<%@include file="/WEB-INF/jsp/home.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<meta charset="UTF-8">
<title>Sign-Up/Login Form</title>

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

</head>
<body>
	<form:form modelAttribute="getorderform" method="get">
		<div class="surveyresultform">
			<p>On Average Male spends ${malehr} hr/day listening music.</p>
			<p>On Average Female spends ${ femalehr} hr/day listening music.</p>
			<p>On Average Other spends ${otherhr} hr/day listening music.</p>
		</div>
		<div class="surveyresultform">
			<p>${audioPC}% likes audio music</p>
			<p>${videoPC}% likes video with music</p>
		</div>
		
		<div class="surveyresultform">
			<p>no of participants = ${totalno}</p>
		</div>
	</form:form>


	<script>
		var app = angular.module('myApp', []);
		
		var s1 = "http://localhost:10695/DecemberServiceResources/api/survey_service/music/";
						
		app.controller(
						'myCtrl',
						function($scope, $http) {	
						
						$scope.a = "http://localhost:10695/DecemberServiceResources/api/survey_service/music/pop";
						$http.get($scope.a).then(function(response) {
							
						$scope.details = response.data;
						$scope.names = [$scope.details.loud];
							});
						});
						
			
	</script>
</body>
</html>
