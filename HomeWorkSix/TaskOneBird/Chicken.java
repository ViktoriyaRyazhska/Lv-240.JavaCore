package com.kate;

public class Chicken extends Bird {
	final String TYPE_BIRDS = "Chicken";
	public void fly(){
		System.out.println(TYPE_BIRDS + " : I'm not flying, only when i have big trouble ");
	}
	public  Chicken(boolean feathers, boolean layEggs) {
		super(feathers,layEggs);	
		
	}

}
