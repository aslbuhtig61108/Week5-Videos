
public class SalariedEmployee extends Employee {

	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
		
	}

	
	@Override  // can remove if desired, but it tells you it comes from a super class or parent class and adding
	// your own implementation or lines of code
	public double calculatePay() {
		return this.getPay() * 80;
	}
	
}


