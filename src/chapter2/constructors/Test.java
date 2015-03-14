package chapter2.constructors;

public class Test {

	public static void main(String[] args) {
		Horse x1 = new Horse(), x2;
		x2 = x1;
	
		Horse.doSomethingStatic();
		Animal.doSomethingStatic();
		
		Horse horse = new Horse();
		horse.doSomethingStatic();
		horse.giveVoice();
		horse.giveVoice();
		horse.staticTest();
		System.out.println("Alive: " + horse.alive + " isAlive(): " + horse.isAlive());
		
		Animal animalReferenceToHorse = horse;
		animalReferenceToHorse.doSomethingStatic();
		
		Animal a = new Horse();
		System.out.println(a.x + " | " + a.showX());			// o KURDE! polimorfizm dziala tylko dla metod!!
		
		System.out.println("Literals: " + 0b111 + " " + 0100);
		
		byte x = 10;
		byte y = 2;
//		byte z = x + y;
		byte z = (byte) (x + y);
		System.out.println(x);
		
		int aa, b = 2, c = 3 + b;
		
		String j = "j", k = "kkkk", g;
		
		Animal $horse = new Horse(), _animal = new Animal("abc");
		
		int cc = 0;
		
		boolean _true = (a instanceof Horse);
		
		System.out.println(5 / 2 + " " + 5 / 2.0);
		
		int i = (int) 1L;
		
		String a1 = "String";
		int a2 = 3;
		int a3 = 7;
		System.out.println(a1 + a2 + a3);
		System.out.println(a3 + a2 + a1);
		
		int zz = 5;
		if(++zz > 5 | ++zz > 6 || ++zz > 7) zz++;
		System.out.println(zz);
		
		int notInit;
//		notInit += 7;
//		notInit++;

		Animal animal = new Animal("x");
		animal.calculate(1234);
//		animal.calculate(123_456_789_098); 
		animal.calculate(123_456_789_098L);
	}

}
