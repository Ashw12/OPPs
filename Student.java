package Lecture31_Opps;

public class Student {
      String name;
      int age;
      public void Intro_yourSelf() {
    	  String name="Ramesh";//ager ham system.out.println name and age me this.(dot)
    	  int age=30;//laga ke name nhi access nhi karenge to local function(class data member) ko access kar lega.
    	  System.out.println("My name is "+this.name+" My age is " +this.age);
      }
}
