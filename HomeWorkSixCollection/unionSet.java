package com.kate;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class unionSet {

	public static void main(String[] args) {
		Set<Integer> setOne = new HashSet<Integer>();
		Random rand = new Random();
		for (int i=0; i<10; i++){
			setOne.add(rand.nextInt(30));
		}
		System.out.println("SetOne are: " + setOne + "; Size " + setOne.size());
		
		Set<Integer> setTwo = new HashSet<Integer>();
		for (int i=0; i<10; i++){
			setTwo.add(rand.nextInt(30));
		}
		System.out.println("SetTwo are: " + setTwo + "; Size "+ setTwo.size());
		
		Set<Integer> union = new HashSet<Integer>(setOne);
		union.addAll(setTwo);
		System.out.println("Union " + union +"; Size "+ union.size());
		
		Set <Integer> intersection = new HashSet<Integer>(setOne);
		intersection.retainAll(setTwo);
		System.out.println("intersection " + intersection);
		
		Set <Integer> diff = new HashSet<Integer>(setOne);
		diff.remove(setTwo);
		System.out.println("Difference "+ diff);

	}

}
