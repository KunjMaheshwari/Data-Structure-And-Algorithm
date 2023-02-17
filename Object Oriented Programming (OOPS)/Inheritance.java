/*
 * Inheritance is when properties and methos of base class are passed on to a
 * derived class.
 */
public class Inheritance {
    public static void main(String args[]) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog denny = new Dog();
        // denny.eat();
        // denny.legs = 4;
        // System.out.println(denny.legs);

        Fish jelly = new Fish();
        jelly.eat();
        jelly.breath();
    }

}

// BASE Class or the Parent Class
class Animal {
    String color; // this is the property

    void eat() { // this is the function in the Animal class
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

// SINGLE INHERITANCE - One base class and one derived class
// Derived class or the Child class
// class Fish extends Animal { // extends is used to derive all the data from
// the parent class
// int fins;

// void swim() {
// System.out.println("Swims in water");
// }
// }

// // MULTI LEVEL INHERITANCE - One base class it's derived class and it's
// derived class and so on..
// class Mammal extends Animal {
// int legs;
// }

// class Dog extends Mammal {
// String breed;
// }

// HIERARCHIAL INHERITANCE - Only One Base class and multiple derived class of
// the same base class.
class Fish extends Animal {
    int swim;

    void swims() {
        System.out.println("Swims in the water");
    }
}

class Mammals extends Animal {
    int walk;

    void walks() {
        System.out.println("Walks");
    }
}
