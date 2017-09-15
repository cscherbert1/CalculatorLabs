<%-- 
    Document   : lab2
    Created on : Sep 13, 2017, 8:00:36 PM
    Author     : cscherbert1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2</title>
    </head>
    <body>
        <h1>Lab 2</h1>
        <h2>Area of a Rectangle</h2>        
        
        <img src="http://cdn-6.analyzemath.com/Geometry/formulas/rectangle.gif">
        
        <p>Provide the Length and Width and click "Calculate Area"</p>
        
        <form name="lab2RectAreaForm" method="POST" action="Lab2ShapeCalculatorController">
            Length: <input type="text" name="inputLength" value="" placeholder="e.g. 5"> <br>
            Width: <input type="text" name="inputWidth" value="" placeholder="e.g. 10"> <br>
            <input type="hidden" name="shapeType" value="rectangle">
            <input type="submit" name="lab2RectFromSubmit" value="Calculate Area">
            
        </form>
        
        <p> ${msg} </p>
        
        <p><a href="index.jsp">Return Home</a></p>
        
    </body>
</html>
