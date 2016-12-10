<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Find user</title>
</head>
<body>

<form method="post">
User name
<input type="text" name="userName" value="${userName}" />
<input type="submit" value="Find" />
</form>

<table border="1">
<tr>
<th>User Name</th>
<th>Sex</th>
<th>Birth Date</th>
<th>Address</th>
</tr>
<tr>
<td>${user.name}</td>
<td>${user.sex}</td>
<td><fmt:formatDate value="${user.dateOfBirth}" pattern="yyyy-MM-dd" /></td>
<td>${user.address.country}, ${user.address.city}</td>
</tr>
</table>

</body>
</html>