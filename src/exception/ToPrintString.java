package exception;

public class ToPrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Priya";
		try {
			System.out.println(word.charAt(5));
		}
		catch(StringIndexOutOfBoundsException s) {
			s.printStackTrace();
			
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();//parentclass
		}
		catch(Exception e) {
			e.printStackTrace();//Parentclass
		}
		finally {
		System.out.println(word.charAt(0));
		}

	}

}
