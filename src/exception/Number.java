package exception;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40};
		try {
		System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
		//System.out.println(a[3]);
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(a[2]);
		}

	}

}
