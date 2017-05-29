
public class Chicken extends NoNFlyingBirds {
	private int eggsPerDay;

	public int getEggsPerDay() {
		System.out.println("Eggs per day " + eggsPerDay);
		return eggsPerDay;
	}

	public void setEggsPerDay(int eggsPerDay) {
		this.eggsPerDay = eggsPerDay;
	}

	public Chicken(String feathers, boolean layEggs, int eggsPerDay) {
		super(feathers, layEggs);
		this.eggsPerDay = eggsPerDay;

	}

	@Override
	public String toString() {
		return "Chicken [eggsPerDay=" + eggsPerDay + "; Feathers=" + getFeathers() + ", isLayEggs()=" + isLayEggs()
				+ "]";

	}

}
