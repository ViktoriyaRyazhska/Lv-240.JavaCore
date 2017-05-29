
public class Eagle extends FlyingBird {
	private int heightOfFly;

	public int getHeightOfFly() {
		return heightOfFly;
	}

	public void setHeightOfFly(int heightOfFly) {
		this.heightOfFly = heightOfFly;
	}

	public Eagle(String feathers, boolean layEggs, int heightOfFly) {
		super(feathers, layEggs);
		this.heightOfFly = heightOfFly;
	}

	@Override
	public String toString() {
		return "Eagle [heightOfFly=" + heightOfFly + ", getFeathers()=" + getFeathers() + ", isLayEggs()=" + isLayEggs()
				+ "]";
	}

}
