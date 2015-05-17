package enumerated_list;

abstract class Drink {

	String name;
	
	enum Temperature {HOT, COLD}
	Temperature temperature;
	
	abstract void drink();
}

class Tea extends Drink {

	protected enum Type {
		GREEN(Temperature.HOT),
		WHITE(Temperature.HOT),
		BLACK(Temperature.COLD);
		
		private Temperature temperature;
		Type(Temperature temperature) {
			this.temperature = temperature;
		}
	}

	@Override
	void drink() {
		System.out.println("Drink tea");
	}
	
	void drink(Type type) {
		System.out.println("Drink " + type + " tea");
	}

}

