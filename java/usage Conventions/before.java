class Point {
    private int x, y;

    void init(int a, int b) {
       this.x = a;
        this.y = b;
    }

    void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    void display() {
        System.out.println("(" + this.x + "," + this.y + ")");
    }
}