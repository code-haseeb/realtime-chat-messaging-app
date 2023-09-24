package ObjectComposition;

public class Car {
    private Engine engine;
    private Wheels wheels;
    private Body body;

    public Car(Engine engine, Wheels wheels, Body body) {
        this.engine = engine;
        this.wheels = wheels;
        this.body = body;
    }

    public void start() {
        System.out.println("Car is starting...");
        engine.start();
    }

    public void drive() {
        System.out.println("Car is in motion...");
        wheels.rotate();
    }

    public void paint() {
        System.out.println("Customizing the car...");
        body.paint();
    }
}
