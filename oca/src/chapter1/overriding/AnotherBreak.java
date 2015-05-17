package chapter1.overriding;

public class AnotherBreak extends OtherBreak implements Barkable {

	@Override
	public void bark() {
		Integer.parseInt("7");
//		NumberFormatException
//		IllegalArgumentException
	}

}
