public class Static {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "Vatsalya School";

        Student s4 = new Student();
        System.out.println(s4.schoolName);
    }
}

class Student {
    String name;
    int roll;

    static String schoolName; // if we declare this once then this will be declared for all the other objects
                              // because of Static keyword.

    // creating a setter
    void setName(String name) {
        this.name = name;
    }

    // creating a getter
    String getName() {
        return this.name;
    }
}