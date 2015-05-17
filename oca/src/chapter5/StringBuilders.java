package chapter5;

public class StringBuilders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		sb.insert(sb.length(), "d");
//		sb.insert(sb.length() + 1, "f");	// can't do, index 4 missing before 5; String index out of range: 5
		System.out.println(sb);
	}

}
