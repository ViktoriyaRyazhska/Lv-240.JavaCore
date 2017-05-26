package com.kate;

public abstract class Bird {
	private boolean feathers;
	private boolean layEggs;
	
	
	public abstract void fly();

	/**
	 * @return the feathers
	 */
	public boolean isFeathers() {
		return feathers;
	}

	/**
	 * @param feathers the feathers to set
	 */
	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	/**
	 * @return the layEggs
	 */
	public boolean isLayEggs() {
		return layEggs;
	}

	/**
	 * @param layEggs the layEggs to set
	 */
	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
		
	}

	
	

	
	
	
	

	
	
	
	
}
