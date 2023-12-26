package inheritance;

public class Person {

	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person () {
		this.name = "Person";
		this.age = 10;
	}
	
	public void print () {
		System.out.println("The details for the Person are:- " + this.name + "The age is:" + this.age);
	}
	
}
