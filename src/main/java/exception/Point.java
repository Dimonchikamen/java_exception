package exception;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) throws IllegalArgumentException {
        if (x < 0 || y < 0) throw new IllegalArgumentException("Значения координат Point должны быть не меньше 0");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
