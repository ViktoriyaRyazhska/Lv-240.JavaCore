package birds;

public class NonFlyingBird extends Bird {


	

	public NonFlyingBird(String type, String feathers, String layEggs) {
		super(type, feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("I can`t fly, and I`m sad :( ");
		
	}

	

}
