package edu.wctc.calculatorlabs.lab1model;

public class ShapeAreaCalculationService {
    
    private Double length;
    private Double width;
    
    public ShapeAreaCalculationService(String length, String width){
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    }
    
    public Double calculateArea(){
        Double area = length * width;
        return area;
    }
}
