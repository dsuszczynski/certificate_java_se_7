package chapter8;

import java.util.Locale;

public class LocaleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale localePl = new Locale("pl");
		System.out.println(localePl.getDisplayLanguage() +"-"+ localePl.getDisplayCountry());
		System.out.println(localePl.getDisplayLanguage(localePl) +"-"+ localePl.getDisplayCountry(localePl));
		
		Locale localePlPl = new Locale("pl", "PL");
		System.out.println(localePlPl.getDisplayLanguage() +"-"+ localePlPl.getDisplayCountry());
		System.out.println(localePlPl.getDisplayLanguage(localePlPl) +"-"+ localePlPl.getDisplayCountry(localePlPl));
		
		Locale localeEn = new Locale("en");
		System.out.println(localeEn.getDisplayLanguage() +"-"+ localeEn.getDisplayCountry());
		System.out.println(localeEn.getDisplayLanguage(localeEn) +"-"+ localeEn.getDisplayCountry(localeEn));
		
		Locale localeEnUS = new Locale("en", "US");
		System.out.println(localeEnUS.getDisplayLanguage() +"-"+ localeEnUS.getDisplayCountry());
		System.out.println(localeEnUS.getDisplayLanguage(localeEnUS) +"-"+ localeEnUS.getDisplayCountry(localeEnUS));
		
		System.out.println(localePlPl.getDisplayLanguage(localeEn) +"-"+ localePlPl.getDisplayCountry(localeEn));
	}

}
