package Polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }

    public void scratch() {
        System.out.println("Cat is scratching.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
        if (myDog instanceof Dog) {
            Dog myRealDog = (Dog) myDog;
            myRealDog.fetch();
        }

        if (myCat instanceof Cat) {
            Cat myRealCat = (Cat) myCat;
            myRealCat.scratch();
        }
    }
}
