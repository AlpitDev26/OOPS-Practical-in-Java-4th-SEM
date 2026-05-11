 // Superclass
class Animal {

    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Subclass inheriting Animal class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class SingleInheritanceDemo {

    public static void main(String[] args) {

        // Creating object of subclass
        Dog d = new Dog();

        // Calling superclass method
        d.eat();

        // Calling subclass method
        d.bark();
    }
}