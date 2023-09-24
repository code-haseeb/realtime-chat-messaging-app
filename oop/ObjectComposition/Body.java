package ObjectComposition;

public class Body {
    private String color;

    public Body(String color) {
        this.color = color;
    }

    public void paint() {
        System.out.println("Car body painted (Color: " + color + ")");
    }
}
