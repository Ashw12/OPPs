package Lecture31_Opps;

public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();//s is referance variable and new student is instance or object.
		System.out.println(s.name);
		System.out.println(s.age);
		s.name="Ramu";
		s.age=20;
		System.out.println(s.name);
		System.out.println(s.age);
		Student s1=new Student();
		s1.name="Vabhavi";
		s1.age=25;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s.Intro_yourSelf();
		s1.Intro_yourSelf();
	}

}
