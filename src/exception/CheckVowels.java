package exception;

public class CheckVowels {

	public static void main(String[] args) throws VowelException {
		// TODO Auto-generated method stub
		String name="mgr";
		try {
		if(!(name.contains("a") || name.contains("e") || name.contains("i") ||name.contains("o") ||name.contains("u"))) {
			throw new VowelException("Not contains Vowel");
		}
		else {
			System.out.println("Contains Vowel");
		}
		}
		catch(VowelException ve) {
			ve.printStackTrace();
		}
		System.out.println("End");

	}

}
