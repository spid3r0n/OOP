class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveTo(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void displayPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}


public class Test {
    public static void main(String[] args) {
        Point p = new Point(2,3);

        p.setX(10);
        System.out.println(p.getX());

        p.displayPoint();
    }
}