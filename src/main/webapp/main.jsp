<%@ page import="com.example.znjxl9bin.mymath.MyMath" %><%--
  Created by IntelliJ IDEA.
  User: merse
  Date: 12/10/2021
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculated</title>
</head>
<body>
<h2>(<%=((MyMath)session.getAttribute("math")).getN()%>:<%=((MyMath)session.getAttribute("math")).getK()%>) is:
    <%=((MyMath)session.getAttribute("math")).eredmenySzamolo(((MyMath)session.getAttribute("math")).getN(),((MyMath)session.getAttribute("math")).getK())%>
</h2>
<h3>My previos result:</h3>
<h3>All visits: <%=((MyMath)session.getAttribute("math")).getCalcnumber()%></h3>

</body>
</html>
