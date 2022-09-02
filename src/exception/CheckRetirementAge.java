package exception;

public class CheckRetirementAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=58;
		try {
			if(age<60) {
				throw new RetirementAgeException("Not Eligible");
			}
			else {
				System.out.println("Eligible");
			}
		}
		catch(RetirementAgeException re) {
			re.printStackTrace();
		}

	}

}
