package chapter5;

public class Arrays {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		System.out.println(arr[1][1]);
		
		int[] arr1 = {1,2,3,4};
		
		int[] arr2;
		arr2 = new int[] {1,2,3,4};
		
		System.out.println("-------------------");
		// assign vs dimensions
		int[][][] arrA = new int[4][2][3];
		int[][] arrB = new int [5][2];
		int[] arrC = new int [1];
		
		arrA[0] = arrB;
//		arrA[1] = arrC;
		arrA[2][0] = arrC;
//		arrA[2][1] = arrB;

		System.out.println(0 % 2);
		
		outer:
			for (int i = 0; i < 5; i++) {
				inner:
					if (true) {
//						continue inner;
						continue outer;
					}
			}
			
		int[] arrayTest1 = {1,2,3,4,5};
		int[] arrayTest;
//		arrayTest = {1,2,3,4,5};
		arrayTest = new int[] {1,2,3,4,5};
		
		Integer i = new Integer(5);
//		String s = (String) i;
	}

}
