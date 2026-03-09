
class Point {
    float x , y ; 

    float CalculateDistanceTo(Point p){
        float distance = (float) Math.sqrt(Math.pow(x - p.x,2) + Math.pow(y - p.y,2)); 
        return distance ; 
    }
    public Point(float x1 , float y1) {
        this.x = x1 ; 
        this.y = y1 ; 
    }
      

    void init(float x , float y)
    {
        this.x = x ; 
        this.y = y ; 
    }
 }

public class exo2 {
    public static void main(String[] args)
    {
    

        Point p1 = new Point(Float.parseFloat(args[0]), Float.parseFloat(args[1])) ;


        System.out.println("distance between p1 and itself");
        System.out.println(p1.CalculateDistanceTo(p1)); 

        Point p2 = new Point(9f,3f); 
        System.out.println("Point p1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Point p2: (" + p2.x + ", " + p2.y + ")");
        
    	System.out.println ("Distance between p1 and p2 is : "+ p1.CalculateDistanceTo(p2));
       
        
    }
}
