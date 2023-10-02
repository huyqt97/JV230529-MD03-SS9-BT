package ra.rikkei.bt1;

import ra.rikkei.bt1.Resizeable;

public class Square implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (1 + percent / 100);
    }
}
