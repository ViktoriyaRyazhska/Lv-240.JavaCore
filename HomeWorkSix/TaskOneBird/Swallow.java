package com.kate;

public class Swallow extends Bird {
	final String TYPE_BIRDS = "Swallow";
		public void fly(){
		System.out.println(TYPE_BIRDS + " : I'm flying nearly earth ");
	}
		public Swallow(boolean feathers,boolean layEggs) {
			super(feathers, layEggs);
					
		}

}
