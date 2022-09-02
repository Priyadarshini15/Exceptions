package exception;

public class CheckStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Priya";
		try {
			if(!name.startsWith("A")) {
			throw new NameException("Not StartsWith A");
		    }
			else {
				System.out.println("StartsWith A");
			}
		}
		catch(NameException ne) {
			ne.printStackTrace();
		}
		System.out.println("End");

	}

}
