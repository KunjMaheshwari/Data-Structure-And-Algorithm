public class Oops {
    public static void main(String args[]) { // By convention main should be public and static
        Pen p1 = new Pen(); // We have created a pen object called p1 and this is called Constructor
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        // BankAccount myaccount = new Backaccount();
        // myaccount.username = "Kunj";
        // myaccount.setPassword("abcd");
    }
}

// class BankAccount {
// public String username;
// private String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }

class Pen {
    // Attributes + functions
    private String color;
    private int tip;

    // GETTER
    String getColor() {
        return this.color; // this keyword is used to refer to the current object.
    }

    int getTip() {
        return this.tip;
    }

    // SETTER
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

// class Student {
// String name;
// int age;
// float percentage;

// void setname(String newName) {
// name = newName;
// }

// void calpercentage(int phy, int chem, int maths) {
// percentage = (phy + chem + maths) / 3;
// }
// }