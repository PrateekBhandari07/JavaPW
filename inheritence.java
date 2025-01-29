class A {
    void display() {
        System.out.println("Display from class A");
    }
}
class B extends A {
    @Override
    void display() {
        System.out.println("Display from class B");
    }
    // Method to call class A's display explicitly
    void callSuperDisplay() {
        super.display(); // Calls class A's display
    }
}
class C extends B {
    @Override
    void display() {
        System.out.println("Display from class C");
    }
    // Method to call class B's display explicitly
    void callSuperDisplay() {
        super.display(); // Calls class B's display
    }
    // Method to call class A's display explicitly
    void callSuperA() {
        super.callSuperDisplay(); // Calls class A's display via class B
    }

}

public class inheritence {
    public static void main(String[] args) {
        C objC = new C();
        // Call class C's display method
        objC.display(); // Output: Display from class C

        // Call class B's display method using objC
        objC.callSuperDisplay(); // Output: Display from class B

        // Call class A's display method using objC
        objC.callSuperA(); // Output: Display from class A
    }
}
