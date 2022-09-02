package exception;

public class ToPrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name1="Priya";
		
		try {
		int num=Integer.parseInt(name1);
		}
		
		catch(NumberFormatException n) {
			n.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();//parentClass
	     }
		System.out.println(name1);

	}

}
