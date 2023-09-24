package ObjectComposition;

public class Main {
    public static void main(String[] args) {
        Engine v8Engine = new Engine("V8");
        Wheels alloyWheels = new Wheels(4);
        Body redBody = new Body("Red");

        Car myCar = new Car(v8Engine, alloyWheels, redBody);

        myCar.start();
        myCar.drive();
        myCar.paint();
    }
}
