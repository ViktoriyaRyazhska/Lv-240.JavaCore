package HW7_1;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        System.out.println(set1);

		Set<String> set2 = new HashSet<String>();
        set2.add("d");
        set2.add("e");
        set2.add("f");
        set2.add("g");
        set2.add("h");
        System.out.println(set2);
        
        Set<String> set= new HashSet<String>(set1); 
        //union
        set.addAll(set2); System.out.println(set);
        //intersection
        set.clear(); set.addAll(set1);
        set.retainAll(set2);
        System.out.println(set);
        //difference
        set.clear(); set.addAll(set1);
        set.removeAll(set2);
        System.out.println(set);

	}

}
