package inheritenceUse;

import inheritance.Student;

public class StudentUse extends Student{
	
	public StudentUse () {
		super("01", 10, 'A', "AB", 12);
	}
	
	public void print () {
		System.out.println("The stduent details:- " + this.studentID);
	}
	
	public static void main (String args[]) {
		
		Student s1 = new StudentUse();
		s1.classNumber = 11;
//		s1.studentID = "123";
//		s1.section = 'C';
//		s1.print();
		s1.print();
		
	}

}
