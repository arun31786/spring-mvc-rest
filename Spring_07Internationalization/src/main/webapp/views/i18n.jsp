<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>I18n</title>
</head>
<body>

    <h1>Spring MVC i18n Example</h1>

    Language : <a href="?lang=en">English</a> | <a href="?lang=fr">French</a> | <a href="?lang=hi">Hindi</a>

    <p>${greetMessage}</p>
    <p><spring:message code="welcome.greeting" text="some default text"/></p>
    
</body>
</html>