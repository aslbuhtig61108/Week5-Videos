
public class Classes {

	public static void main(String[] args) {
		/* 
		 * Learning how to create our own class
		 *  
		 */
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "480-123-4567";
		
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		// This is much nicer/neater passing the info into the CONSTRUCTOR then hard code above
		Student student3 = new Student("Tom", "Riddle", "904-123-4567", 11);

	}

}
