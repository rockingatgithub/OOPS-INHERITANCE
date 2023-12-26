package inheritance;

public class Student extends Person{

	protected String studentID;
	public int classNumber;
	char section;
	
	public Student (String studentID, int classNumber, char section, String name, int age) {
		super(name, age);
		this.studentID = studentID;
		this.classNumber = classNumber;
		this.section = section;
	}
	
	public void print () {
		System.out.println("The student details are:- ");
		System.out.println("Stduent ID is:- " + this.studentID);
		System.out.println("Student name is:- " + this.name);
		System.out.println("Stduent age is:- " + this.age);
		System.out.println("Stduent class is:- " + this.classNumber);
		System.out.println("Stduent section is:- " + this.section);
	}
	
}
