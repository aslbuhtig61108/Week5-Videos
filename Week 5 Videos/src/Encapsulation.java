
public class Encapsulation {

	public static void main(String[] args) {
		
		Student student = new Student();  // example of poor programming
		student.setFirstName("Sally");// it works, but we need to encapsulate the object's data
		student.setPhoneNumber("1234567890");
		student.introduce();; // and only expose what needs to be used
		// Above: after setting the access modifiers on our data in Student.java
		// we've lost access to the fields. Of course we need access to read and write to our fields
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		/*
		 * Access Modifiers
		 * Four types but three used most often
		 * public = accessible everywhere
		 * protected = within the class, other classes within the same package; all subclasses
		 * private = only accessible from within the class itself
		 * no modifier = similar to protected except NOT accessible
		 * in a subclass in a different package
		 */
		// most methods are set public
		// most fields and some methods are set to private
		
		/*
		 * We want to "encapsulate" our properties so that they don't change outside the
		 * proper way we want them to change (within the scope)
		 * 
		 * We would use a method because we can add functionality. To encapsulate properly, 
		 * we hide our data and then add some public methods that allow you to access 
		 * that data and do what you want to be done to that data 
		 * 
		 * public void setName_of_Proptery(parameters data) {
		 *     // block of code
		 * }
		 */
		
		

	}

}
