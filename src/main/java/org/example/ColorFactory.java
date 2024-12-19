package org.example;


public class ColorFactory implements AbstractFactory<Color>{
    public Color Create(String colorType) {
        switch (colorType) {
            case "RED":
                return new Red();
                case "GREEN":
                    return new Green();
                    case "BLUE":
                        return new Blue();
        }
        return null;
    }


}
