// Super keyword is used to refer immediate parent class object. 
/* It is used to access the parent's property.
 * To access parent's function
 * to access parent's constructor
 */

public class Super {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}