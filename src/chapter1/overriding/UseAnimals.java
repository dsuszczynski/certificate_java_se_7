package chapter1.overriding;

public class UseAnimals {
	public void doStuff(Animal animal) {
		System.out.println("In the Animal version.");
	}
	
	public void doStuff(Dog dog) {
		System.out.println("In the Dog version.");
	}
	
	public void doStuff(Horse horse) {
		System.out.println("In the Horse version.");
	}
	
	Animal useIt() {
		System.out.println("Use Animal!");
		return new Animal();
	}
}
