<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${ li }"  var="l">
<c:out value="${l.eid }"/>
<c:out value="${l.ename }"/>
<c:out value="${l.eaddres }"/> <a href="./delete?eid=${l.eid }">del</a> <a href="./edit?eid=${l.eid }">edit</a> 
</c:forEach>
</body>
</html> 