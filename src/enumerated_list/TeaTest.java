package enumerated_list;

public class TeaTest {

	public static void main(String... args) {
		Tea tea = new Tea();
		tea.drink();
		tea.drink(Tea.Type.BLACK);
		
		Drink.Temperature drinkTemperature = Drink.Temperature.COLD;
		Tea.Type teaType = Tea.Type.BLACK;
	}

}
