package com.bilgeadam.boost.lesson023;

import java.util.Comparator;

public class OrderNotesComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
	
		return o1.compareToIgnoreCase(o2);
	}

}
