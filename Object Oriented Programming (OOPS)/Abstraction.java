/* Abstraction - Hiding all the unnecessary details and showing only the important parts to the user.  */

public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();

    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // In abstract classes there is no implementation.
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on two legs.");
    }
}