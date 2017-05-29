
public class Penguin extends NoNFlyingBirds {
	private int eatFishPerDay;

	public int getEatFishPerDay() {
		return eatFishPerDay;
	}

	public void setEatFishPerDay(int eatFishPerDay) {
		this.eatFishPerDay = eatFishPerDay;
	}

	public Penguin(String feathers, boolean layEggs, int eatFishPerDay) {
		super(feathers, layEggs);
		this.eatFishPerDay = eatFishPerDay;
	}

	@Override
	public String toString() {
		return "Penguin [eatFishPerDay=" + eatFishPerDay + ", getFeathers()=" + getFeathers() + ", isLayEggs()="
				+ isLayEggs() + "]";
	}

}
