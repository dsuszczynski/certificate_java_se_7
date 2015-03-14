package chapter2.constructors;

public abstract class Being {

	public static String staticTest = "Being";
	
	public static void staticTest() {
		System.out.println(staticTest);
	}

	void calculate(int i) {
		System.out.println("Calculate: " + i);
	}

	private String privateTest;
	boolean alive;

	public Being(boolean alive) {
		super();
		this.alive = alive;
	}

	public String getPrivateTest() {
		return privateTest;
	}

	public void setPrivateTest(String privateTest) {
		this.privateTest = privateTest;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	short primitivTest() {
		return 0;
	}
	
}
