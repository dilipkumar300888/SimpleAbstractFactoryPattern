package org.example;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory<Shape> shapeAbstractFactory = (AbstractFactory<Shape>) FactoryProducer.getFactory("Shape");
        AbstractFactory<Color> colorAbstractFactory = (AbstractFactory<Color>) FactoryProducer.getFactory("Color");
        Shape circle = shapeAbstractFactory.Create("CIRCLE");
        circle.draw();
        Color color = colorAbstractFactory.Create("RED");
        color.fill();
    }
}
