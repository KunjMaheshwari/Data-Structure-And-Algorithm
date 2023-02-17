public class Copyconstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Kunj";
        s1.roll = 23;
        s1.password = "KunjMaheshwari";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Copy constructor concept
        s2.password = "abcd";

        s1.marks[2] = 100;

        // printing the marks for s2
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow COPY CONSTRUCTOR
    // Student(Student s1) {
    // marks = new int[3]; // array of marks
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // Deep COPY CONSTRUCTOR
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Contructor is called");
    }
}