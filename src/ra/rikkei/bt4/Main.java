package ra.rikkei.bt4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Blue", 5, 10);
        Shape circle = new Circle("Red", 7);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        rectangle.display();

        System.out.println("Circle Area: " + circle.getArea());
        circle.display();
    }
}
