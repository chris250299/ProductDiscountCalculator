<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/1/2019
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/display-discount" method="post">
    <center>
        <h2>Product Discount Calculator</h2>
        <table>
            <tr>
                <td> Product Description:</td>
                <td><input type="text" name="product" size="30"></td>
            </tr>
            <tr>
                <td>List Price:</td>
                <td><input type="number" name="price" size="30"></td>
            </tr>
            <tr>
                <td>Discount Percent:</td>
                <td><input type="number" name="percent" size="30"> (%)</td>
            </tr>
        </table>
        <input type="submit" name="calculator" value="Calculate Discount">
    </center>
</form>
</body>
</html>
