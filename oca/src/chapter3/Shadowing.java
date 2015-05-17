package chapter3;

public class Shadowing {

	static int staticShadow = 10;
	int shadow = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int staticShadow = 20;
		int shadow = 2;
		
		if (staticShadow == 20) {
			int staticShadow_2 = 30;
		}
		
	}
	
	public void testShadowing(int shadow) {
		for (int shadow_2 = 0; shadow_2 < 30; shadow_2++) {
			
		}
		
//		System.out.println(shadow_2);
		System.out.println(shadow);
	}

}
