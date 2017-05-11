package edu.com;

public class Appl {

	public static void main(String[] args) {
		student s1 = new student();
		s1.setName("Olya");
		s1.setRating(4);
		
		student st2=new student("Igor");
		st2.setRating(5);
		
		student st3 =new student("Vasya",3);
		st3.setRating(7);
		boolean b=s1.betterStudent(st2);
		System.out.println(b);
		System.out.println(st3.betterStudent(st3));
		
		System.out.println(s1);
		System.out.println(student.getAvgRating());

	}

}
