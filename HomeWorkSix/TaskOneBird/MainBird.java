package com.kate;

public class MainBird {

	public static void main(String[] args) {
		Bird [] bird=new Bird[4];
		bird[0] = new Eagle(true,true); 
		bird[1] = new Swallow(true,true);
		bird[2] = new Penguin(false,false);
		bird[3] = new Chicken(true,true);
		
		for (int i = 0; i<bird.length; i++){
			bird[i].fly();
			System.out.println(" feathers: "+ bird[i].isFeathers()+ "; " + " layEggs: " + bird[i].isLayEggs());
		}

	}

}
