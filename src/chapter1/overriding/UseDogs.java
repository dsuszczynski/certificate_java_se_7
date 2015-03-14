package chapter1.overriding;

public class UseDogs extends UseAnimals {
	Dog useIt() {
		System.out.println("Use Dog!");
		return new Dog();
	}
}
