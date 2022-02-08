package com.codegym;

import java.util.Scanner;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập loại hình: ");
        String type = scanner.next();

        try {
            Shape shape = ShapeFactory.getShape(type);
            shape.draw();
        }catch (NullPointerException e){
            System.out.println("Loại hình không hợp lệ");
        }
    }
}
