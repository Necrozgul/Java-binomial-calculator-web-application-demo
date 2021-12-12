<%--
  Created by IntelliJ IDEA.
  User: merse
  Date: 12/10/2021
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Binomial coefficient of:</h1>
<form action="/bin" method="post">
    <i style="display: <%=session.getAttribute("displayerror")%>">Values must be between 0 and 15</i><br>
    n: <input type="number" name="n" value=""><br>
    k: <input type="number" name="k" value=""><br>
    <input type="submit" value="Show Result"><br>
</form>
</body>
</html>
