package number22;

import java.util.Arrays;

public class BlaBlaBla {
	public static void main(String[] args) {
		
	
		int [] arr = {4, 7, 12, -2};
		int max = arr[0];
		int maxN = 0;
		
		int i=0;
		while (i<arr.length){
			if(arr[i]> max){
				max = arr[i];
				maxN=i;
			}
			i++;
		}
		System.out.println("Maximum = " + max+ " and takes place in "+ maxN);
		
		Arrays.toString(arr);
		
		System.out.println(arr.length);
		System.out.println(arr);
		
		
		int plus = arr[0];
		int sum = 0;
		int a = 0;
		while (a<arr.length){
			if(arr[a]>plus){
				plus=arr[a];
				sum=a;
			}
			System.out.println(sum);
			
		}
		
		
		}

		
	}

