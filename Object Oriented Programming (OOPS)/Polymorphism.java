/* There are two types of functions in Polymorphism 
 * 1. Method overloading - Multiple functions with the same name but different parameters.
 * 2. Method Overriding - Parent and the child class contains the same function(same parameters) but with a different definition. 
 */

public class Polymorphism {
    public static void main(String args[]) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2, 5));
        // System.out.println(calc.sum((float) 2.5, (float) 1.3));
        // System.out.println(calc.sum(2, 3, 5));

        Dog denny = new Dog();
        denny.eats();
    }
}

// // METHOD OVERLOADING
// class Calculator {
// // 1st function
// int sum(int a, int b) {
// return a + b;
// }

// // 2nd function
// float sum(float a, float b) {
// return a + b;
// }

// // 3rd function
// int sum(int a, int b, int c) {
// return a + b + c;
// }

// }

// METHOD OVERRIDING
class Animal {
    void eats() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void eats() {
        System.out.println("The Dog is eating.");
    }
}