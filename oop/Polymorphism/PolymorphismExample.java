// Step 1: Create a superclass with a method to be overridden
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Step 2: Create subclasses that inherit from the superclass and override the method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    // Additional method specific to the Dog class
    public void fetch() {
        System.out.println("Dog is fetching.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }

    // Additional method specific to the Cat class
    public void scratch() {
        System.out.println("Cat is scratching.");
    }
}

// Step 3: Create a main class to demonstrate polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        // Step 4: Create objects of different subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Step 5: Demonstrate polymorphism by calling the overridden method
        myDog.makeSound(); // Output: Dog barks: Woof! Woof!
        myCat.makeSound(); // Output: Cat meows: Meow! Meow!

        // Step 6: Additional behaviors of subclasses are not accessible
        // myDog.fetch(); // This would result in a compilation error
        // myCat.scratch(); // This would also result in a compilation error

        // Step 7: Downcasting to access subclass-specific methods
        if (myDog instanceof Dog) {
            Dog myRealDog = (Dog) myDog; // Downcast to access Dog-specific methods
            myRealDog.fetch(); // Output: Dog is fetching.
        }

        if (myCat instanceof Cat) {
            Cat myRealCat = (Cat) myCat; // Downcast to access Cat-specific methods
            myRealCat.scratch(); 
        }
    }
}
