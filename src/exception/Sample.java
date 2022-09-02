package exception;

public class Sample {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		try {
		System.out.println(num1/num2);
		}
		catch(ArithmeticException ae) {
			//System.err.println("Error occurs");
			//System.out.println("Error occurs");
			ae.printStackTrace();
		}
		System.out.println("End");
		
		

	}

}
