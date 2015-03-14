package chapter1.package_a;

abstract public class AbstractClass {

	public static String tree;

	public AbstractClass() {
		super();
		System.out.println("abstract");
	}
	abstract public void methodA();
//	abstract void methodB();

	enum Season {SUMMER, WINTER, SPRING, AUTUMN};

}
