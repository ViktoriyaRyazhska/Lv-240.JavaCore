package birds;

public abstract class Bird {

	// constructor
	public Bird(String type, String feathers, String layEggs) {
		this.setType(type);
		this.setFeathers(feathers);
		this.setLayEggs(layEggs);
	}

	// getters setters

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}

	// variables
	private String type;
	private String feathers;
	private String layEggs;

	// method
	public abstract void fly();

	@Override
	public String toString() {
		return "Hello, I`m a " + type + " , my feathers are " + feathers + ", and I lay eggs " + layEggs + ". ";
	}
}
