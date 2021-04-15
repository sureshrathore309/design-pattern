package com.elite.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeCircle = shapeFactory.getShape("com.elite.factory.Circle");
        Shape shapeSquare = shapeFactory.getShape("com.elite.factory.Square");
        shapeSquare.draw();
        shapeCircle.draw();
    }
}
