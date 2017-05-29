
public class Swallow extends FlyingBird {
	private int hoursSinging;

	public int getHoursSinging() {
		return hoursSinging;
	}

	public void setHoursSinging(int hoursSinging) {
		this.hoursSinging = hoursSinging;
	}

	public Swallow(String feathers, boolean layEggs, int hoursSinging) {
		super(feathers, layEggs);
		this.hoursSinging = hoursSinging;
	}

	@Override
	public String toString() {
		return "Swallow [hoursSinging=" + hoursSinging + ", getFeathers()=" + getFeathers() + ", isLayEggs()="
				+ isLayEggs() + "]";
	}

}
