<%-- 
    Document   : lab3
    Created on : Sep 13, 2017, 8:42:28 PM
    Author     : cscherbert1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3</title>
    </head>
    <body>
        <h1>Lab 3</h1>        
        <h2>Area of a Rectangle</h2>        
        
        <img src="http://cdn-6.analyzemath.com/Geometry/formulas/rectangle.gif">
        
        <p>Provide the Length and Width and click "Calculate Area"</p>
        
        <form name="lab3RectAreaForm" method="POST" action="Lab3ShapeCalculatorController">
            Length: <input type="text" name="inputLength" value="" placeholder="e.g. 5"> <br>
            Width: <input type="text" name="inputWidth" value="" placeholder="e.g. 10"> <br>
            <input type="hidden" name="shapeType" value="rectangle">
            <input type="submit" name="lab2RectFromSubmit" value="Calculate Area">
            
        </form>
        
        <p> ${rectMsg} </p>
        
        <h2>Area of a Circle</h2>
        
        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Circle_Area.svg/220px-Circle_Area.svg.png">
        <p>Provide the Radius and click "Calculate Area"</p>
        
        <form name="lab3CirAreaForm" method="POST" action="Lab3ShapeCalculatorController">
            Radius: <input type="text" name="inputRadius" value="" placeholder="e.g. 2"> <br>
            <input type="hidden" name="shapeType" value="circle">
            <input type="submit" name="lab3CirAreaFormSubmit" value="Calculate Area">
        </form>
        
        <p> ${cirMsg} </p>
        
         <h2>Find the Missing Side of a Right Triangle</h2>
        
        <img src="https://qph.ec.quoracdn.net/main-qimg-8a9e3735630bffd9428e26cf505fda25">
        <p>Provide the value of sides A and B, then click "Calculate"</p>        
        
        <form name="lab3TriSideForm" method="POST" action="Lab3ShapeCalculatorController">
            Side A: <input type="text" name="inputSideA" value="" placeholder="e.g. 2"> <br>
            Side B: <input type="text" name="inputSideB" value="" placeholder="e.g. 3"> <br>
            Side C: <input type="text" name="inputSideC" value="" placeholder="Leave Blank"<br>
            <input type="hidden" name="shapeType" value="triangle">
            <input type="submit" name="lab3TriSideFormSubmit" value="Calculate">
        </form>
        
        <p> ${triMsg} </p>
        
        <p><a href="index.jsp">Return Home</a></p>
    </body>
</html>
