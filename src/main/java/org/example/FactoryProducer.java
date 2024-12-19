package org.example;

public class FactoryProducer {
    public static AbstractFactory<?> getFactory(String type) {
        if(type.equals("Shape"))
            return new ShapeFactory();
        else if(type.equals("Color"))
            return new ColorFactory();
        return null;
    }
}
