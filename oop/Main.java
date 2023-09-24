class Vehicle{
  private String  model;
  private String  brand;
  private int year;

  public Vehicle(String model,String brand,int year){
    this.model=model;
    this.brand=brand;
    this.year= year;
  }
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public void brake() {
        System.out.println("The vehicle is braking.");
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
class Car extends Vehicle{
  private int doors;
  public Car(String  model,String  brand ,int year, int doors){
  super(model,brand,year);
  this.doors=doors;
    
  }
  public void honk() {
        System.out.println("The car is honking.");
  }
  @Override
  public void displayInfo(){
    super.displayInfo();
        System.out.println("doors: " + doors);
  }
}
public class Main {
  public static void main(String[] args) {
    Car mycar = new Car("Toyota","new",2014,5);
    mycar.start();
    mycar.stop();
    mycar.accelerate();
    mycar.brake();
    mycar.displayInfo();
    
  }
}