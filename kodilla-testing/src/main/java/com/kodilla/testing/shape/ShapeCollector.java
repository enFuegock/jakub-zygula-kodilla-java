package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> figureList = new ArrayList<>();
    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }
    public void addFigure(Shape shape){
        figureList.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figureList.contains(shape)) {
            figureList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        Shape theShape = null;
        if (n >= 0 && n < figureList.size()) {
            theShape = figureList.get(n);
        }
        return theShape;
    }
    public String showFigures(){
        String continousList = "";
        for(Shape shape : figureList){
            System.out.print(shape);
            continousList += shape.getShapeName();
        }
        return continousList;
    }
    public int getFigureListQuantity(){
        return figureList.size();
    }
}