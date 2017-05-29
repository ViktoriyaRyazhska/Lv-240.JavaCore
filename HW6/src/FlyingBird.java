
public abstract class FlyingBird extends Bird{
	@Override
	void fly() {
		System.out.println("I can fly");
		
	}
	public FlyingBird(String feathers, boolean layEggs){
		super(feathers,layEggs);
	}
}
