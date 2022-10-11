package Lecture31_Opps;

public class Student_client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2=new Student();
		Student s3=new Student();
		 s2.name="kunal";
		s2.age=26;
		s3.name="Hardik";
	    s3.age=22;
	    System.out.println(s2.name+" "+s2.age);
	    System.out.println(s3.name+" "+s3.age);
	    //test1(s2,s3);
	    //test2(s2,s3);
	    int my_age=20;
	    String my_name="C";
	    Test3(s2,s3.age,s3.name,my_age,my_name);
	    System.out.println("**************");
	    System.out.println(s2.name+" "+s2.age);
	    System.out.println(s3.name+" "+s3.age);
	   

	}

	public static void Test3(Student s, int age, String name, int my_age, String my_name) {
		// TODO Auto-generated method stub
		s.age=0;
		s.name="_";
		age=0;
		name="_";
		my_age=0;
		my_name="_";
		
	}

	public static void test1(Student s2, Student s3) {
		// TODO Auto-generated method stub
		Student t=s2;
		s2=s3;
		s3=t;
	}
	public static void test2(Student s2, Student s3) {
		s2=new Student();//this line create new object.
		int tempa=s2.age;
		s2.age=s3.age;
		s3.age=tempa;
		s3=new Student();//this line create new object.
		String tempn=s2.name;
		s2.name=s3.name;
		s3.name=tempn;
	}

}
