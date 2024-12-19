package org.example;

public class ShapeFactory implements AbstractFactory<Shape> {
    public Shape Create(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "TRIANGLE":
                return new Triangle();
        }
        return null;
    }
}
