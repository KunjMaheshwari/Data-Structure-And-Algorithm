/*
 * Constructor is a special method which is invoked automatically at the time of
 * object creation.
 * Constructor have a same name as class
 * Constructor don't have a return type.
 * Constructor are only called once, at object creation.
 * Memory allocation happens when constructor is called.
 */

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student(21);
        System.out.println(s1.rollnumber);
        Student s2 = new Student("Kunj Maheshwari");
        System.out.println(s2.name);
        Student s3 = new Student();
        System.out.println();
        // Student s4 = new Student("Prakhar Sharma", 48);
        // System.out.println(s4.name, s4.rollnumber);
        // The above code will give an error coz there is no constructor with the
        // parameters name and rollnumber.
    }
}

class Student {
    String name;
    int rollnumber;
    String password;

    Student() { // Here we named the constructor Student() coz the class name and constructor
                // name is always same.
        // This is the non parameterized constructor.
    }

    Student(String name) { // This is a parameterized constructor.
        this.name = name;
    }

    Student(int rollnumber) {
        this.rollnumber = rollnumber;
    }
}