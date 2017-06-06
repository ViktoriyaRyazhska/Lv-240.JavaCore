package week6.Lesson9;

public class Lesson9Practical2 {

	public static void main(String[] args) {
		
		try {
			Plant plant = new Plant(2, "red", "long");
		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
}
