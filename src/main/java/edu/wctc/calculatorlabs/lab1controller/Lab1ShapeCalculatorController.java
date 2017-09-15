package edu.wctc.calculatorlabs.lab1controller;

import edu.wctc.calculatorlabs.lab1model.ShapeAreaCalculationService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cscherbert1
 */
@WebServlet(name = "Lab1ShapeCalculatorController", urlPatterns = {"/Lab1ShapeCalculatorController"})
public class Lab1ShapeCalculatorController extends HttpServlet {

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
            
            if(shapeType.equalsIgnoreCase("rectangle")){
                ShapeAreaCalculationService calculator = new ShapeAreaCalculationService(request.getParameter("inputLength"), request.getParameter("inputWidth"));
                String shapeAreaResponse = calculator.calculateArea().toString();
                request.setAttribute("areaResponse", shapeAreaResponse);
            } else {
                throw new IllegalArgumentException("Something went wrong. We only calculate the area of Rectangles.");
            }            
            
        } catch (Exception e){
           request.setAttribute("errorMsg", e);
        }
        
        RequestDispatcher view = request.getRequestDispatcher("/lab1Response.jsp");
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
