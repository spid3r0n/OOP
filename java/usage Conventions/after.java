class Point {
     int x;
     int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void displayPoint() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
}