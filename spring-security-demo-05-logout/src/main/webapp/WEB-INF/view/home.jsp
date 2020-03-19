<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<html>

<head>
<title> My Company Security</title>

</head>

<body>
<h2> Company Home Page</h2>
<hr>

Welcome to My Company Home Page!


<!-- Add a logout button -->

<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="Logout" />
	
	</form:form>





</body>

</html>