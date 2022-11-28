package ComonMethods;

public class ComapreBetweenTwoString {
	
	public void compareTheExpectedAndAual(String expected,String Actual) {
		if(Actual.equalsIgnoreCase(expected)) {
			System.out.println("The msg is matched and the actual msg is "+Actual);
		}
		else {
			System.out.println("The "+Actual+" Message is not matched with "+expected);
		}
	}

}
