package homework;

import java.util.Comparator;

public class SortByCourseComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o2.getCourseN() - o1.getCourseN();
	}

}