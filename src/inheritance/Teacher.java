package inheritance;

public class Teacher extends Person{

	String EmpID;
	String subject;
	
	public Teacher (String EmpID, String subject, String name, int age) {
		super(name, age);
		this.EmpID = EmpID;
		this.subject = subject;
	}
	
	public void print () {
		System.out.println("The teacher details are:-"+ this.name);
	}
	
}
