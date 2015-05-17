package chapter8;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double number = 123456789.0987;
		Locale localePl = new Locale("pl");
		Locale localeEn = new Locale("en");
		
		NumberFormat[] numberFormats = new NumberFormat[6];
		numberFormats[0] = NumberFormat.getInstance();
		numberFormats[1] = NumberFormat.getInstance(localePl);
		numberFormats[2] = NumberFormat.getInstance(localeEn);
		numberFormats[3] = NumberFormat.getCurrencyInstance();
		numberFormats[4] = NumberFormat.getCurrencyInstance(localePl);
		numberFormats[5] = NumberFormat.getCurrencyInstance(localeEn);
		
		for (NumberFormat numberFormat : numberFormats) {
			System.out.println(numberFormat.format(number));
		}
	}

}
