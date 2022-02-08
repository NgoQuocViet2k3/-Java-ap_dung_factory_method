package com.codegym;

import java.util.Locale;

public class ShapeFactory {
    public static Shape getShape(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;

        }
    }

}
