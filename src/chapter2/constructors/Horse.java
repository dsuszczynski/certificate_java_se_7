package chapter2.constructors;

public class Horse extends Animal {
	
	boolean alive;
	
	Horse() {
		super("Blacky");
	}
	
	String x = "horse";
	
	String showX() {
		return "Horse show: " + x;
	}
	
	int checkThatDown() {
		short x = 5;
		
		return x;
	}
	
	int checkThatUp() {
		long x = 5;
		
		return (int) x;
	}
	
	static void doSomethingStatic() {
		System.out.println("I did something static from horse :)");
	}
	
//	public String giveVoice() {
//		System.out.println("Voice of: " + x + "(this return String)");
//		return "Ihaaa";
//	}
	
	public void giveVoice() {
		System.out.println("Voice of: " + x);
	}
	
}
