
public class Student {

	// Notice the first character of the class name is capitalized
	// This is called Pascal case
	// Difference in naming conventions between our class names and variable names
	
	// Main method is the main entry point to our projects. The rest of classes 
	// will not have a main method.
	
	// STEP 1. For our class, we need to create properties
	// No values because each instance will have 
	// its own unique value. Just terminate with semi-colon
	
	// Note: You may want to have a property shared with the property of the class 
	// than each object of the class. Use the keyword 'static'
	static int numberOfStudents; // access this on the class
	
	String firstName;  
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	// Define your constructor when using the THIS. method; also known as overload
	public Student() {} 
	
	// Another constructor example that only accepts two string paramters
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
	// To create a CONSTRUCTOR. Only method we don't put a return type
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName; // this. keyword represents the instance used in the class
		this.lastName = firstName;
		this.phoneNumber = firstName;
		this.phoneNumber = firstName;
	}
	
	// STEPO 2. We want the student to do something. 
	// So, we'll create an action, that the student can do
	public void introduce() {
		// doesn't take values. uses the parameters of the student class
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	
	
}
