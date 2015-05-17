package chapter2.constructors;

public class Animal extends Being {
	private String name;
	String x = "animal";
	
	private static int sp;
	
	Animal(String name) {
		super(true);
		this.name = name;
//		RuntimeException
//		Error
		
		setPrivateTest("private value");
		System.out.println(getPrivateTest());
	}

	void calculate(long i) {
		System.out.println("Calculate: " + i);
	}

	String showX() {
		return "Animal show: " + x;
	}
	
	static void doSomethingStatic() {
		System.out.println("I did something static from animal :)");
	}
	
	public static void staticTest() {
		System.out.println(staticTest);
	}
	
	public void giveVoice() {
		System.out.println("Voice of: " + x);
	}
	
	static void readSp() {
		System.out.println(sp);
	}
	
//	int primitivTest() {
//		return 0;
//	}
//	
//	int primitivTest() {
//		return 0;
//	}
	
}
