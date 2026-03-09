 public class PointCol extends Point {
        String color ; 

    // constructor
    public PointCol(int x, int y , String color)
    {
        super(x ,y) ; this.color = color; 
    }

    public void colorise(String color)
        {
            this.color = color ;  
           
        }

     // display
        public void display(){
        System.out.println("the coordinates of the Point are : (" + x + ", " + y + ", " + color + ")"); 
    }

        
    }

