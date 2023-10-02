package ra.rikkei.bt2;

public class Main {
    public static void main(String[] args) {
        Square[] square = new Square[1];
        square[0] = new Square(5);

        for (Square sq : square) {
            System.out.println("Diện tích hình vuông là :"+sq.getArea());
            if (sq instanceof Colorable) {
                sq.howToColor();
            }
        }
    }
}
