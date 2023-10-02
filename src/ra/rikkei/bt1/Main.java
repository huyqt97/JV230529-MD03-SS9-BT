package ra.rikkei.bt1;

import ra.rikkei.bt1.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(100);
        System.out.println(circle);
        circle.resize(20);
        System.out.println(circle);
        System.out.println("Diện tích hình tròn : " + circle.getRadius());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(5);
        System.out.println(rectangle);
        rectangle.resize(10);
        rectangle.resize(10);
        System.out.println("Diện tích hình chữ nhật :" + rectangle);
        Square square = new Square(3);
        System.out.println("Diện tích hình vuông : " + square);
    }
}
