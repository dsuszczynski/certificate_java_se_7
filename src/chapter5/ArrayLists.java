package chapter5;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list;
		
		List<String> sList = new ArrayList<String>(5);
		System.out.println(sList.size());
		
		sList.add("A");
		sList.add("B");
//		sList.add(3, "C");
		sList.add(2, "C");
		sList.add(1, "BB");
		sList.add("A");
		System.out.println(sList);
		sList.remove("A");
		System.out.println(sList);
	}

}
