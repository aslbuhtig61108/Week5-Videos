
public class Classes {

	public static void main(String[] args) {
		/* 
		 * 
		 * We talked about OOP concepts difference between a class and an object
		 * also 4 pillars of OOP: abstraction, encapsulation, inheritance, and polymorphism 
		 * Creating classes and how to use them to create classes
		 * We've used so far classes that come with Java to create objects in conjunction
		 * with the 'new' keyword
		 * 
		 * Learning how to create our own class
		 *  
		 */
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.firstName = "Tom";  // all classes inherently inherit from the Java Object class
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "480-123-4567";
		
		// structure the data together in a class and create a method that uses the data in the class
		// and then prints out something
		student1.introduce(); 
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		// This is much nicer/neater passing the info into the CONSTRUCTOR then hard code above
		Student student3 = new Student("Tom", "Riddle", "904-123-4567", 11);
		student3.introduce();
	}

}
