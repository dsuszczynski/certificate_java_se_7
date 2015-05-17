package chapter8;

import java.util.Calendar;

public class CallendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar calendarRoll = Calendar.getInstance();
		System.out.println(calendarRoll.getTime());
		calendarRoll.roll(Calendar.HOUR_OF_DAY, true);
		System.out.println(calendarRoll.getTime());
		calendarRoll.roll(Calendar.HOUR_OF_DAY, 1);
		System.out.println(calendarRoll.getTime());
		calendarRoll.roll(Calendar.HOUR_OF_DAY, 2);
		System.out.println(calendarRoll.getTime());
		
		System.out.println();
		
		Calendar calendarAdd = Calendar.getInstance();
		System.out.println(calendarAdd.getTime());
		calendarAdd.add(Calendar.HOUR_OF_DAY, 1);
		System.out.println(calendarAdd.getTime());
		calendarAdd.add(Calendar.HOUR_OF_DAY, 1);
		System.out.println(calendarAdd.getTime());
		calendarAdd.add(Calendar.HOUR_OF_DAY, 2);
		System.out.println(calendarAdd.getTime());
		System.out.println(calendarAdd.get(calendarAdd.DAY_OF_MONTH));
		System.out.println(calendarAdd.get(calendarAdd.DAY_OF_WEEK_IN_MONTH));
		calendarAdd.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(calendarAdd.getTime());
		System.out.println(calendarAdd.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendarAdd.get(calendarAdd.DAY_OF_MONTH));
		System.out.println(calendarAdd.get(calendarAdd.DAY_OF_WEEK_IN_MONTH));
		calendarAdd.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println(calendarAdd.getTime());
		System.out.println(calendarAdd.get(calendarAdd.DAY_OF_WEEK_IN_MONTH));
		calendarAdd.add(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
		System.out.println(calendarAdd.getTime());
	}

}
