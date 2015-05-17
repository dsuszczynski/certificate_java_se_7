package chapter1.overriding;

public class Dog  extends Animal implements Barkable {
	public void bark() {
		System.out.println("Bark, bark...");
	}
	
	public void eat() {
		System.out.println(Dog.class + " is eating!");
	}
}
