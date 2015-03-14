package chapter1.overriding;

public class Horse extends Animal {
	protected void eat(String food, int number) {
		System.out.println(Horse.class + " is eating " + food + "!");
	}
	
	public void eat(int number, String food) {
		System.out.println(Horse.class + " is eating " + food + "!!");
	}
	
	public void eat() {
		System.out.println(Horse.class + " is eating!");
	}
	
//	public String eat() {
//		System.out.println(Horse.class + " is eating witn return!");
//		return "";
//	}

	public void barkTest(Barkable b) {
		b.bark();
	}
	
	public void eatTest(Animal a) {
		a.eat();
	}
	
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.eat();
		horse.eat("grass", 2);
		horse.eat(3, "grass");
		
		Dog dog = new Dog();
		horse.barkTest(dog);
		horse.barkTest(horse);
		
		Animal dog2 = new Dog();
		horse.barkTest(dog2);
		
		horse.eatTest(horse);
		horse.eatTest(dog);
		horse.eatTest(dog2);
		
		dog2.eat();
		
		UseAnimals useAnimals = new UseAnimals();
		useAnimals.doStuff(dog2);
		useAnimals.useIt();
		
		UseDogs useDogs = new UseDogs();
		useDogs.useIt();
		
		UseAnimals useAnimalsRefToDogs = new UseDogs();
		useAnimalsRefToDogs.useIt();
	}
	
	public static void main(int args) {
		Horse horse = new Horse();
		horse.eat();
		horse.eat("grass", 1);
	}
	
}
