package HW6_1;

public class Run {

	public static void main(String[] args) {
 
		Bird[] bird= new Bird[4];
		bird[0]=new Swallow(true, true);
		bird[1]=new Eagle(true, true);
		bird[2]=new Penguin(false, true);
		bird[3]=new Chicken(true, true);
		
		for (Bird br : bird) 
		{
			System.out.println(br);
			br.fly();
		}
	}
}


public abstract class Bird {
	private boolean feathers;
	private boolean layEggs; 
	
	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public abstract void fly();

	@Override
	public String toString() {
		return "This bird have feathers - " + feathers + " and have Eggs - " + layEggs + "]";
	}
		
}


public class FlyingBird extends Bird {

	public FlyingBird(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("This bird is flying");
	}

}



public class NonFlyingBird extends Bird {

	public NonFlyingBird(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("This bird is not flying");
	}

}


public class Chicken extends NonFlyingBird {

	public Chicken(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

}


public class Eagle extends FlyingBird {

	public Eagle(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

}


public class Penguin extends NonFlyingBird {

	public Penguin(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

}

public class Swallow extends FlyingBird {

	public Swallow(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

}

