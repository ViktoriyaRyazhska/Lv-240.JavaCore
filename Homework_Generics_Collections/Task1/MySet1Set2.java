package homework_6_1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MySet1Set2 {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		//create set1
		HashSet<Integer> Set1 = new HashSet<Integer>();
		for (int i = 0; i < 20; i++) {
			while (Set1.size() < 20)
				Set1.add(Integer.parseInt(String.valueOf(rnd.nextInt(50))));
		}
		
		//create set2
		HashSet<Integer> Set2 = new HashSet<Integer>();
		for (int i = 0; i < 20; i++) {
			while (Set2.size() < 20)
				Set2.add(Integer.parseInt(String.valueOf(rnd.nextInt(50))));
		}
		//print Sets 
		System.out.println(Set1);
		System.out.println(Set2);
		
		//intersection
		HashSet<Integer> Set3 = new HashSet<Integer> (Set1.size() >Set2.size() ?Set1.size():Set2.size());
		Set3.addAll(Set1);
		Set3.retainAll(Set2);
		
		System.out.println(Set3);

		//difference a-b
		HashSet<Integer> c = new HashSet<Integer> (Set1.size());
		Set3.addAll(Set1);
		Set3.removeAll(Set2);
		
		System.out.println(Set3);
	}
	
	

}
