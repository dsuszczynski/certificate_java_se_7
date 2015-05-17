package chapter1;

public class NonAbstractClass2 extends NonAbstractClass {

	public static void main(String[] args) {
		new NonAbstractClass2().methodA(); // public
		new NonAbstractClass2().methodC(); // default
	}

}
