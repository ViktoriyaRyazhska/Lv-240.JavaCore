
public abstract class NoNFlyingBirds extends Bird {

	@Override
	void fly() {
		
		System.out.println("I can not fly");
		
	}

	public NoNFlyingBirds(String feathers, boolean layEggs){
		super(feathers,layEggs);
	}

}
