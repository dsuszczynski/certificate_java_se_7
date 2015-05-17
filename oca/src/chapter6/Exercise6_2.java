package chapter6;

public class Exercise6_2 {

	public static void main(String[] args) {
		
		int age = Integer.parseInt(args[0]);
		
		outer:
			while(age <= 21) {
				if (age == 16) {
					System.out.println("get your driver's license");
					age++;
					continue outer;
				}
				System.out.println("Another year");
				age++;
			}
		
	}

}
