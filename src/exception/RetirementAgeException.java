package exception;

public class RetirementAgeException extends Exception {
	public RetirementAgeException(String msg) {
		super(msg);
	}
	public void printStackTrace() {
		System.out.println("Not Eligible");
	}

}
