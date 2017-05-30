package birds;

public class FlyingBird extends Bird {

	public FlyingBird(String type, String feathers, String layEggs) {
		super(type, feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("I can fly, because I`m a bird");
		
	}

	
	}


