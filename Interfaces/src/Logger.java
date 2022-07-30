
public interface Logger {

	// interfaces do not define any implementation
	// only the method signatures
	
	// Step 1: define the methods they want to have 
	// but not what they are going to do
	
	// include the key word 'implements' to invoke an interface and
	// use , commas to separate multiple interfaces
	
	// Note: these are abstract methods
	public void info(String info);
	public void warning (String warning);
	public void error (String error);
	public void fatal (String fatal);
	public void close();
	
	
}
