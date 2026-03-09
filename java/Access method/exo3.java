class Point {
    public int x;
    private int y; 
}

public class exo3 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5; // Accessible because x is public
        // p.y = 10; // Not accessible because y is private
        System.out.println("Value of x: " + p.x);
        // System.out.println("Value of y: " + p.y); // This will cause a compilation error
    }
}