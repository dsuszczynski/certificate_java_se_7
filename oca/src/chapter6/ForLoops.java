package chapter6;

public class ForLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5 ; i++, System.out.print(i)) {
			System.out.println(" -" + i);
		}
		
		System.out.println("\n--\n");
		
		for (int i = 0; i < 5 ; ++i, System.out.print(i)) {
			System.out.println(" -" + i);
		}
		
		System.out.println("\n--\n");
		
		int y = 0;
		for ( ; y < 5 ; y++) {
			System.out.println(y);
		}
		System.out.println("After loop y = " + y);
		
		int z = 0;
		for ( ; z < 5 ; ) {
			System.out.println(z);
			z++;
		}
		System.out.println("After loop z = " + z);
		
		int[] ints = {1,2,3,4,5};
		int intsI = 0;
//		for(int intsI : ints) {
//		for(intsI : ints) {
		for(int intsI2 : ints) {
			System.out.println(intsI2);
		}
	}

}
