public class Oops{
  public static void main(String args[]){   // By convention main should be public and static 
    Pen p1 = new Pen();   // We have created a pen object called p1 and this is called Constructor
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
  }
}

class Pen{
  // Attributes + functions
  String color;
  int tip;
  
  void setColor(String newColor){
    color = newColor;
  }
  void setTip(int newTip){
    tip = newTip;
  }
}

class Student{
  String name;
  int age;
  float percentage;
  
  void setname(String newName){
    name = newName;
  }
  void calpercentage(int phy, int chem, int maths){
    percentage = (phy+chem+maths)/3;
  }
}
