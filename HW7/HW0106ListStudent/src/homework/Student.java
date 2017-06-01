package homework;

import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {

	private String name;
	private int courseNum;

	public Student(String name, int courseNum) {

		this.name = name;
		this.courseNum = courseNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourseN() {
		return courseNum;
	}

	public void setCourseN(int courseN) {
		this.courseNum = courseN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseNum;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (courseNum != other.courseNum)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void printStudents(List<Student> students, Integer courseN) {

		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student stud = iter.next();
			if (stud.getCourseN() == courseN) {
				System.out.println(stud.getName());
			}
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", courseNum=" + courseNum + "]";
	}

	@Override
	public int compareTo(Student o) {

		return this.name.compareTo(o.getName());
	}
}