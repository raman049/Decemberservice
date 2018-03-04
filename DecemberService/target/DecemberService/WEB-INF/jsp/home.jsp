<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Sign-Up/Login Form</title>

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

</head>
<body>
	<h1 align="center">
		<font color="white"> DECEMBER 2017 </font>
	</h1>
	<div class="row">
		<form action="login_in" method="post">
			<button type="submit" class="buttonHeadder ">Home</button>
		</form>

		<form action="profile" method="post">
			<button type="submit" class="buttonHeadder ">Profile</button>
		</form>

		<form action="survey" method="post">
			<button type="submit" class="buttonHeadder ">Survey</button>
		</form>
		<form action="survey_result" method="post">
			<button type="submit" class="buttonHeadder ">Results</button>
		</form>
	</div>

</body>
</html>