package com.kate;

public class Eagle extends Bird {
	    final String TYPE_BIRDS = "Eagle";
	   
		public void fly(){
		System.out.println(TYPE_BIRDS + " : I'm flying very high ");
	}

		public Eagle(boolean feathers,boolean layEggs) {
			super(feathers, layEggs);
			
			
		}
		
		
		
}
