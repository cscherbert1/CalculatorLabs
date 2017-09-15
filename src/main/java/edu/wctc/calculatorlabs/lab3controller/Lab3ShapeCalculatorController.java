package edu.wctc.calculatorlabs.lab3controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.wctc.calculatorlabs.lab3model.ShapeAreaCalculationService3;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author cscherbert1
 */
@WebServlet(name = "Lab3ShapeCalculatorController", urlPatterns = {"/Lab3ShapeCalculatorController"})
public class Lab3ShapeCalculatorController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String shapeType = request.getParameter("shapeType");
        
        try {
            if (shapeType.equalsIgnoreCase("rectangle")){
                
                ShapeAreaCalculationService3 rectCalc = new ShapeAreaCalculationService3(request.getParameter("inputLength"), request.getParameter("inputWidth"));
                String rectAreaResponse = rectCalc.calculateRectangleArea().toString();
                String rectMsg = "Result: " + rectAreaResponse;
                request.setAttribute("rectMsg", rectMsg);

            } else if(shapeType.equalsIgnoreCase("circle")){
                ShapeAreaCalculationService3 circCalc = new ShapeAreaCalculationService3(request.getParameter("inputRadius"));
                String circAreaResponse = circCalc.calculateCircleeArea().toString();
                String cirMsg = "Result: " + circAreaResponse;
                request.setAttribute("cirMsg", cirMsg);                
                
            } else { //triangle
                String sideC = "0.0";
                ShapeAreaCalculationService3 triCalc = new ShapeAreaCalculationService3(request.getParameter("inputSideA"),
                        request.getParameter("inputSideB"), sideC);
                String c = triCalc.calculateHypotenuse().toString();
                String triMsg = "Result: " + c;
                request.setAttribute("triMsg", triMsg);
            }
            
        } catch (Exception e){
            request.setAttribute("errorMsg", e);
        }
        
        RequestDispatcher view = request.getRequestDispatcher("/lab3.jsp");
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
