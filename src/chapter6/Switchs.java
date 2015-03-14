package chapter6;

public class Switchs {

	final static short x = 2;
	final static int y = 0;
	final static Integer z = 4; 	// Integer nie moze byc constatn
	
	enum color {BLUE, RED, BLACK}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 3;
		switch(a) {
			case 1 : {
			 	System.out.println("One");
			 	break;
			}
			case x : 
				System.out.println("Two");
				break;
			case 3 : 
				System.out.println("Three");
			case 4 :
//			case z : 
				System.out.println("Four");
			default:
				System.out.println("Default");
		}
		
		System.out.println("------------------------------");
		
		for (int z = 0; z < 4; z++) {
			switch (z) {
				case x: System.out.print("0 ");
				case x - 1: System.out.print("1 "); break;
				default: System.out.print("def ");
				case x-2: System.out.print("2 ");
			}
		}
		
		switch (color.BLACK) {
			case BLUE : System.out.println("blue");
			case BLACK : System.out.println("black");
		}
		
	}

}
