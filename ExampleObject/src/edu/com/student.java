package edu.com;

public class student {
	private String name;
	private double rating;

	private static double sumRating = 0;
	private static int count = 0;
	private static double avgRating;

	public static double getAvgRating() {
		return sumRating / count;
	}

	public static int getCount() {
		return count;
	}

	public student(String name, double rating) {
		this.name = name;
		this.rating = rating;
		count++;
		sumRating = sumRating + rating;
	}

	public student(String name) {
		this.name = name;
		count++;
	}

	public student() {
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		sumRating = sumRating - this.rating;
		this.rating = rating;
		sumRating = sumRating + rating;
	}

	public boolean betterStudent(student st) {
		return this.getRating() > st.getRating();
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", rating=" + rating + "]";
	}

}
