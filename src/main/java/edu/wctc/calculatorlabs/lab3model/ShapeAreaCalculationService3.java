package edu.wctc.calculatorlabs.lab3model;

/**
 *
 * @author cscherbert1
 */
public class ShapeAreaCalculationService3 {
    private Double length;
    private Double width;
    private Double radius;
    private Double sideA;
    private Double sideB;
    private Double sideC;
    
    public ShapeAreaCalculationService3(String length, String width){
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    }
    
    public ShapeAreaCalculationService3(String radius){
        this.radius = Double.parseDouble(radius);
    }
    
    public ShapeAreaCalculationService3(String sideA, String sideB, String sideC){
        this.sideA = Double.parseDouble(sideA);
        this.sideB = Double.parseDouble(sideB);
        this.sideC = Double.parseDouble(sideC);

    }
    
    
    public Double calculateRectangleArea(){
        Double area = length * width;
        return area;
    }
    
    public Double calculateCircleeArea(){
        Double area = Math.PI * Math.pow(radius, 2.0);
        return area;
    }
    
    public Double calculateHypotenuse(){
        //a^2 + b^2 = c^2
        Double c = Math.sqrt((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)));
        return c;
    }
}
