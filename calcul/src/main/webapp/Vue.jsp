<%@ page import="controller.calculModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	calculModel model =(calculModel) request.getAttribute("calculModel");
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="calcul" method="post">
		<label>operand 1</label>
		<input type="text" name="number1">
		<label>Select operator:</label>
		<select name="operator">
		<option>addition</option>
		<option>substraction</option>
		<option>multiplication</option>
		<option>division</option>
		</select>
		<label>operand 2</label>
		<input type="text" name="number2">
		<button type="submit">Calculate</button>
	</form>
	
	<h2> Result : <%= model.getRes() %></h2>
</body>
</html>