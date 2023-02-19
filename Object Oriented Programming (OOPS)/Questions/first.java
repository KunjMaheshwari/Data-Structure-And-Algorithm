public class One {
    public static void main(String args[]) {
        Student s = new Student(); // s is the object
        // fill here
        s.name = "Kunj Maheshwari";
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int marks;
}
