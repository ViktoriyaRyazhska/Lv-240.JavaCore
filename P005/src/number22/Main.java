package number22;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Employee [] em = new Employee[5];
		em[0] = new Employee("Andrew", 1, 4500);
		em[1] = new Employee("Josh", 2, 7000);
		em[2] = new Employee("Bob", 1, 5000);
		em[3] = new Employee("Carl", 3, 4000);
		em[4] = new Employee("Antonio", 2, 2900);
		
		System.out.println(Arrays.toString(em));
		
		System.out.println(em[3]);
	}
}
