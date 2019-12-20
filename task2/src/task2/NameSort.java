package task2;

import java.util.Comparator;


import task2.SecondTa;

public class NameSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return(((SecondTa)o1).getName().compareTo(((SecondTa)o2).getName()));
		
	}

}
