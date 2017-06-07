package HW7_3;

public class Student {
        private String name;
        private int course;
		
        public Student() {}

		public Student(String name, int course) {
			this.name = name;
			this.course = course;
		}

		public String getName() {
			return name;
		}

		public int getCourse() {
			return course;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", course=" + course + "]";
		}
		
        
}

package HW7_3;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}

package HW7_3;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCourse()-o2.getCourse();
	}

}



package HW7_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Student> student=new ArrayList<Student>();
		student.add(new Student("Vasya",1));
		student.add(new Student("Olya",1));
		student.add(new Student("Ira",1));
		student.add(new Student("Nic",2));
		student.add(new Student("Igor",2));
		
		System.out.print("Enter course:");
		Scanner scr=new Scanner(System.in);
		printStudents(student,scr.nextInt());
		
		System.out.println();
		System.out.println("Students ordered by Name");
		student.sort(new NameComparator());
        for (Student st : student) {
            System.out.println(st);
        }
        
        System.out.println();
        System.out.println("Students ordered by Course");
        student.sort(new CourseComparator());
        for (Student st : student) {
            System.out.println(st);
        }

	}
	
	public static void printStudents(List<Student> students, int course){
		Iterator<Student> iter=students.iterator();
		Student student;
		while (iter.hasNext()){
			student=iter.next();
			 if (student.getCourse()==course) {
				 System.out.println(student);
			 }
			
		}
	} 

}
