package edu.wctc.calculatorlabs.lab2model;

public class ShapeAreaCalculationService2 {
    
    private Double length;
    private Double width;
    
    public ShapeAreaCalculationService2(String length, String width){
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    }
    
    public Double calculateArea(){
        Double area = length * width;
        return area;
    }
}
