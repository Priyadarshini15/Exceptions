package exception;

public class CheckAge {

	public static void main(String[] args)throws AgeException {
		// TODO Auto-generated method stub
		int age=12;
		try {
		if(age<18) {
			throw new AgeException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
		}
		catch(AgeException c) {
	         c.printStackTrace();
		}
		
		finally {
			System.out.println("Election closed");
		}

	}

}
