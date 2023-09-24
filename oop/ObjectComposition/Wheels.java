package ObjectComposition;

public class Wheels {
    private int count;

    public Wheels(int count) {
        this.count = count;
    }

    public void rotate() {
        System.out.println("Wheels are rotating (Count: " + count + ")");
    }
}
