package chapter7;

public class AssertionTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		assert (args[0] != null);
		
		int x = 1;
		assert(x == 1) : "x = " + x;

//		int assert = 5;

		if (x == 2) {
			throw new Exception("Blee :D");
		}

		try {
			assert x == 2;
//		} catch (AssertionError e) {
//			System.out.println("Catched Assertion Error!" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Catched Exception!" + e.getStackTrace());	
		}

		try {
			new AssertionTest().doSomething(0);
		}
		catch (AssertionError e) {
			System.out.println(e.getStackTrace());
			System.out.println("Catched Assertion Error from Object!\n" +  e.getStackTrace());
		}
	}
	
	private void doSomething(int y) throws AssertionError {
		assert y == 1;
	}

}
