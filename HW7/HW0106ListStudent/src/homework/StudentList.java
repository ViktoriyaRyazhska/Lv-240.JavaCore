package homework;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentList {


	public static void main(String[] args) {
		
		List <Student> studentList = new ArrayList<>();
		studentList.add(new Student("Zoye", 5));
		studentList.add(new Student("Matt", 1));
		studentList.add(new Student("Andrew", 3));
		studentList.add(new Student("Ronald", 4));
		studentList.add(new Student("Faye", 2));
		System.out.println("Sorting students by name using Collections.sort and Comparable interface");
		Collections.sort(studentList);
		
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		
		
		System.out.println();
		System.out.println("Sort student by courseNumber in descending order using Comparator interface ");
		studentList.sort(new SortByCourseComparator());
		
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("Sort student by name in ascending order by Anonymous inner class Comparator");
		//Anonymous inner comparator sorting by Name in ascending order
		studentList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.getName().compareTo(o1.getName());
			}
		});
		for (Student student : studentList) {
		System.out.println(student);
		}
		
		
		
	}
	
}