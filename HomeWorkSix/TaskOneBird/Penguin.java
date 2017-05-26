package com.kate;

public class Penguin extends Bird {
	final String TYPE_BIRDS = "Penguin";
	
	public void fly(){
		System.out.println(TYPE_BIRDS + " : I'm  not flying and sometimes think i'm not a bird ");
	}
	public Penguin(boolean feathers,boolean layEggs) {
		super(feathers, layEggs);
		
	}

}
