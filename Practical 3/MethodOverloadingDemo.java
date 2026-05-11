class MathOperations {

    // Overloaded method for power (int)
    void power(int a, int b) {
        System.out.println("Power (int): " + Math.pow(a, b));
    }

    // Overloaded method for power (double)
    void power(double a, double b) {
        System.out.println("Power (double): " + Math.pow(a, b));
    }

    // Overloaded method for absolute value (int)
    void absolute(int a) {
        System.out.println("Absolute (int): " + Math.abs(a));
    }

    // Overloaded method for absolute value (double)
    void absolute(double a) {
        System.out.println("Absolute (double): " + Math.abs(a));
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        MathOperations obj = new MathOperations();

        // Calling overloaded power methods
        obj.power(2, 3);
        obj.power(2.5, 2.0);

        // Calling overloaded absolute methods
        obj.absolute(-10);
        obj.absolute(-15.75);
    }
}