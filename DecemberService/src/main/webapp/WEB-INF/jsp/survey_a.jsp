<%@include file="/WEB-INF/jsp/home.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Sign-Up/Login Form</title>

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

</head>
<body>
	<div class="surveyform">
		<form:form modelAttribute="surveya" action="submit_a" method="post">
			<td><br> 1. Age group:<br> <select name="age"
				class="opt">
					<option class="opt2" value="0-10">0-10</option>
					<option value="11-17">11-17</option>
					<option value="18-24">18-24</option>
					<option value="24-34">24-34</option>
					<option value="24-34">24-34</option>
					<option value="45-64">45-64</option>
					<option value="64 +">64 +</option>

			</select></td>
			<br>
			<br>
			<td>2. Select gender:<br> <select name="gender" class="opt">
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
			</select>
			</td>
			<br>
			<br>
			<td>3. Favorite music genre: <br> <select name="genre"
				class="opt">
					<option value="Alternative">Alternative Music</option>
					<option value="Blues">Blues</option>
					<option value="Classical">Classical Music</option>
					<option value="Country">Country Music</option>
					<option value="Dance">Dance Music</option>
					<option value="Easy">Easy Listening</option>
					<option value="Electronic">Electronic Music</option>
					<option value="European">European Music</option>
					<option value="Hip Hop / Rap">Hip Hop / Rap</option>
					<option value="Indie">Indie</option>
					<option value="Inspirational">Inspirational (incl. Gospel)</option>
					<option value="Asian">Asian Pop (J-Pop, K-pop)</option>
					<option value="Jazz">Jazz</option>
					<option value="Latin">Latin Music</option>
					<option value="New">New Age</option>
					<option value="Opera">Opera</option>
					<option value="Pop">Pop</option>
					<option value="RnB">RnB / Soul</option>
					<option value="Reggae">Reggae</option>
					<option value="Rock">Rock</option>
					<option value="World">World Music / Beats</option>
					<option value="Other">Other</option>
			</select>
			</td>
			<br>
			<br>
			<td>4. Hours spend Listening: <br>
			<select name="time" class="opt">
					<option value="<1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
			</select>

			</td>
			<br>
			<br>
			<td>5. Source of music: <br> <select name="source"
				class="opt">
					<option value="radio">FM Radio</option>
					<option value="cd">CD</option>
					<option value="iheat">iheart Radio</option>
					<option value="itune">itune</option>
					<option value="onlineRadio">online Radio</option>
					<option value="pandora">Pandora</option>
					<option value="spotify">Spotify</option>
					<option value="tv">TV</option>
					<option value="youtube">Youtube</option>
					<option value="moblieapp">Other mobile app</option>
					<option value="others">Others</option>
			</select>
			</td>
			<br>
			<br>
			<td>6. Form of music source: <br> <select name="form"
				class="opt">
					<option value="audio">Audio</option>
					<option value="video">Video</option>
			</select>
			</td>
			<br>
			<br>
			<td>6. Loudness: <br> <select name="loudness" class="opt">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
			</select>
			</td>
			<br>
			<br>

			<button class="button button-block">Submit</button>
		</form:form>
	</div>
	<script>
		var app = angular.module('myApp', []);
		app.controller('myCtrl', function($scope) {
			$scope.firstName = "John";
			$scope.lastName = "Doe";
		});
	</script>
</body>
</html>
