package chapter1;

public class VarArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkVarArgs(1);
		checkVarArgs(1, 2);
		checkVarArgs(new int[] {1, 2});
	}

	public static void checkVarArgs(int... vA) {
		System.out.println("c v a ...: " + vA);
	}
	
	public static void checkVarArgs(int vA) {
		System.out.println("c v a: " + vA);
	}

}
