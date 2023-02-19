// NOTE - We can assign the CHILD Object in the Parent Reference in java By default. 

public class Fourth {
    public static void main(String args[]) {
        Vehicle obj1 = new Car(); // Vehicle is the reference
        obj1.print(); // polymorphism ( overriding)

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class (Car)");
    }
}