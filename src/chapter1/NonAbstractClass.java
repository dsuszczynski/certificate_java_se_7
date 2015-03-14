package chapter1;

import chapter1.package_a.AbstractClass;

public class NonAbstractClass extends AbstractClass {

	final String dog;
	final String wolf;
	
	enum Tea {TEA_1, TEA_2};
	
	NonAbstractClass() {
		super();
		dog = "dogi dog";
		System.out.println(dog);
	}
	
	NonAbstractClass(String otherCon) {
		this(); 	// must be, because initialize final instance variable
	}

	{
		wolf = "ałuuuu";
		System.out.println(wolf);
	}
	
	@Override
	public void methodA() {
		final String cat = null;
//		cat = "test final'a";
		
		final String fish;
		fish = "plum plum";
	}

//	@Override
//	void methodB() {
//		
//	}

	void methodC() {
		System.out.println("bi bi");
	}

	public static void main(String[] args) {
		System.out.println(AbstractClass.tree);
		AbstractClass.tree = "old";
		System.out.println(AbstractClass.tree);
		
		new NonAbstractClass("abc");
	}

}
