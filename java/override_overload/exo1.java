class Vehicle {
    protected String model; 
    int year ; 
    int distance; 

    public void displayInfo()
    {
        System.out.println("infos are : " + model + ", " + year); 
    }
      public Vehicle()
    {
        year = 1999; model = "porsch"; 
    }
    public void displayInfo(String model, int year)
    {
        this.model = model ; this.year = year; 
        System.out.println( model + " " +  year) ; 
    }
  
}
class Car extends Vehicle {
    protected int fuelEfficiency ; 

    public float calculateFuelConsumption()
    {
        return (distance * fuelEfficiency) / 100; 
    }
    public void displayInfo()
    {
        super.displayInfo(); 
        System.out.println("fuel efficiency : " + fuelEfficiency +  " fuel consumption: " + calculateFuelConsumption()); 

    }
    public void displayInfo(String model , int year)
    {
        super.displayInfo(model, year); 
       System.out.println("fuel efficiency : " + fuelEfficiency +  " fuel consumption: " + calculateFuelConsumption()); 

    }
    
}

public class exo1 
{
    public static void main(String args[]) {
        Car car1 = new Car(); 
        car1.displayInfo(); 
        Vehicle vcl = new Vehicle(); 
        vcl.displayInfo("BMW", 2020);
        car1.displayInfo("BMW", 2017); 
    }
}


