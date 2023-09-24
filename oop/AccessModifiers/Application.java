package AccessModifiers;

class AccessModifier {
    public String publicField = "This is a public field";
    private String privateField = "This is a public field";
    protected String protectedField = "This is a public field";
    String defaultField = "This is a public field";

    public void publicMethod() {
        System.out.println("This is a public ");
    }

    private void privateMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a public method");
    }

    void defaultMethod() {
        System.out.println("This is a public method");
    }
}

public class Application {
    public static void main(String[] args) {
        AccessModifier accessModifierExample = new AccessModifier();

        System.out.println("Accessing Public Members");
        System.out.println(accessModifierExample.publicField);
        accessModifierExample.publicMethod();
        // Accessing private vairables and methods would cause an Error
        System.out.println("Accessing private Members");
        System.out.println(accessModifierExample.privateField);
        accessModifierExample.privateMethod();

        System.out.println("Accessing protected Members");
        System.out.println(accessModifierExample.protectedField);
        accessModifierExample.protectedMethod();

        System.out.println("Accessing Public Members");
        System.out.println(accessModifierExample.defaultField);
        accessModifierExample.defaultMethod();

    }
}
