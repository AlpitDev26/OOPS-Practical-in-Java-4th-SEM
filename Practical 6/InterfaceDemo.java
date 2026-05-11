// Interface
interface Animal {

    void sound();
}

// First class implementing interface
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

// Second class implementing interface
class Cat implements Animal {

    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        // Polymorphism using interface reference
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}