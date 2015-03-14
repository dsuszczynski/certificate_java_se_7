package enumerated_list;

import enumerated_list.Coffee.CoffeeColor;

enum CoffeeSize { SMALL, MEDIUM, NORMAL, BIG, HUGE, OVERWHELMING }

enum CoffeeType {
	ESPRESSO(CoffeeSize.SMALL),
	NORMAL(CoffeeSize.NORMAL),
	LATEMAHIATO(CoffeeSize.HUGE);
	
	CoffeeType(CoffeeSize size) {
		this.size = size;
	}
	
	private CoffeeSize size;
	public CoffeeSize getSize() {
		return size;
	}
}

class Coffee {

	enum CoffeeColor { BLACK, BROWN, LATE, other }

	CoffeeSize size;
	CoffeeColor color;
	CoffeeType type;
}

public class CoffeeTest1 {
	public CoffeeSize coffeeSize;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.size = CoffeeSize.HUGE;
		coffee.color = CoffeeColor.BLACK;
		coffee.type = CoffeeType.ESPRESSO;
		
		System.out.println("Size: " + coffee.size + " - " + coffee.size.ordinal());
		System.out.println("Color: " + coffee.color + " - " + coffee.color.ordinal());
		System.out.println("Type: " + coffee.type + " - " + coffee.type.getSize() + " - " + coffee.type.ordinal());
	}

}
