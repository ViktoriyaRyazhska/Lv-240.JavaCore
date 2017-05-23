package homework3;

import java.util.Scanner;

public class Task1b {
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Please, enter x value");
	        	final int tempIntValue1 = sc.nextInt();
	        	int int1 = tempIntValue1;
	        	System.out.println("Please, enter y value");
	        	final int tempIntValue2 = sc.nextInt();
	        	int int2 = tempIntValue2;
	        	System.out.println("Please, enter z value");
	        	final int tempIntValue3 = sc.nextInt();
	        	int int3 = tempIntValue3;
	        	
	        	if (int1>int2 && int1>int3){
	    			System.out.println("x is max");
	    		}
	    		if (int1<int2 && int1<int3){
	    			System.out.println("x is min");
	    		}
	    		if (int2>int1 && int2>int3){
	    			System.out.println("y is max");
	    		}
	    		if (int2<int1 && int2<int3){
	    			System.out.println("y is min");
	    		}
	    		if (int3>int1 && int3>int2){
	    			System.out.println("z is max");
	    		}
	    		if (int3<int1 && int3<int2){
	    			System.out.println("z is min");
	    		}
	        }catch (NumberFormatException e) {
	            e.printStackTrace();
	       }
		
	}
}
