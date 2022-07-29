
abstract class Dog {  // here's our example of an abstract class named Dog
	// String breed;  // in this class we also declared the breed variable
	                  // Commenting out LINE3 emphasis the importance of
					  // abstract methods (methods not implemented yet
					  // 
	
	public void bark() { //  as well as, created a bark method within this abstract class
		System.out.println("Bark!!!");
	}
	
	public abstract void poop();  
}
// testing 123

class Chihuahua extends Dog {
	public void poop() {
		System.out.println("Dog pooped!!!");
	}
}

public class AbstractPractice1 {

	public static void main(String[] args) {
		// An abstract class is a group of variables and methods to create other classes
		
		Chihuahua c = new Chihuahua(); // an error occurs on the method "cannot instantiate the type Dog
		                   // if we remove 'abstract' from LINE#1, the error is resolved
						   // if we turn the class back into an abstract one, we cannot use the variable Dog
		 				   // because you can't use an abstract class like a regular class
						   // abstract class helps make regular classes you use there
		c.bark();
		c.poop();
		// System.out.println(c.breed);  // returns a null value because it was not set and comment out LINE3
	}

}
