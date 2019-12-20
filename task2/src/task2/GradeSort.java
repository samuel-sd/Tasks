package task2;

import java.util.Comparator;

import task2.SecondTa;

public class GradeSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (((SecondTa) o1).getGrade() > ((SecondTa) o2).getGrade()) {
			return 1;
		}

		else if (((SecondTa) o1).getGrade() < ((SecondTa) o2).getGrade()) {
			return -1;
		} else
			return 0;
	}
}
