<%-- 
    Document   : lab1Form
    Created on : Sep 12, 2017, 8:30:45 PM
    Author     : cscherbert1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
        <h1>Lab 1</h1>
        <h2>Area of a Rectangle</h2>
        
        <img src="http://cdn-6.analyzemath.com/Geometry/formulas/rectangle.gif">
        
        <p>Provide the Length and Width and click "Calculate Area"</p>
        
        <form name="lab1RectAreaForm" method="POST" action="Lab1ShapeCalculatorController">
            Length: <input type="text" name="inputLength" value="" placeholder="e.g. 5"> <br>
            Width: <input type="text" name="inputWidth" value="" placeholder="e.g. 10"> <br>
            <input type="hidden" name="shapeType" value="rectangle">
            <input type="submit" name="lab1RectFromSubmit" value="Calculate Area">
            
        </form>
    </body>
</html>
