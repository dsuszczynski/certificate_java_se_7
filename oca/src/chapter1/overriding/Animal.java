package chapter1.overriding;

public class Animal implements Barkable {
	protected void eat() {
		System.out.println(Animal.class + " is eating!");
	}

	@Override
	public void bark() {
		System.out.println("Generic noise.");
	}

	@Override
	public void other() {
		// TODO Auto-generated method stub
		
	}
}
