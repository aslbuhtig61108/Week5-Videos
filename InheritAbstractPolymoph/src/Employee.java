
public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	public Employee(String firstName, String lastName, double pay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
	}
		
	public abstract double calculatePay(); // no implementation meaning no lines of code
										   // only time you would put a semi-colon after the method signature
										   // example of POLYMORPHISM because each class that inherits or can 
										   // implement their own way; this is a polymorphic method
	
	// Returns info describing each of the employees 
	public String getInformation() {
		return "Name: " + firstName + " " + lastName 
				+ "\nReports to: " + reportsTo // "\n means a new line.. it's included within the double quotes
				+"\nAddress: " + address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

}