package enumerated_list;

import enumerated_list.Coffee.CoffeeColor;
import enumerated_list.testpack.*;

public class CoffeeTest12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.size = CoffeeSize.OVERWHELMING;
		coffee.color = CoffeeColor.LATE;
		
		CoffeeSize coffeeSize = CoffeeSize.BIG;
		CoffeeColor coffeeColor = CoffeeColor.BROWN;
		
		System.out.println("Size: " + coffee.size + " - " + coffee.size.ordinal());
		System.out.println("Color: " + coffee.color + " - " + coffee.color.ordinal());
		
		
		CoffeeTest1 coffeeTest1;
		
		TestClass class1 = new TestClass();
		class1.numberValue = 5;
//		class1.s
	}

}
