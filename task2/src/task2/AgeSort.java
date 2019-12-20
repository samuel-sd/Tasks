package task2;

import java.util.Comparator;

import task2.SecondTa;

public class AgeSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(((SecondTa)o1).getAge()>((SecondTa)o2).getAge())
		{
			return 1;
		}
		else	if(((SecondTa)o1).getAge()<((SecondTa)o2).getAge())
		{
			return -1;
		}
		else
		return 0;
	}
}
