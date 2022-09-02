 package exception;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		String name1="Priya";
		try {
		System.out.println(name.concat(name1));                  
		}
		catch(NullPointerException np) {
			np.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
        System.out.println(name1.length());
		}
	}

}
