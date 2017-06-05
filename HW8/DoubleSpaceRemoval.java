package homework;

public class DoubleSpaceRemoval {

	public static void main(String[] args) {
		String str = "I    am      learning     Java   Core";
		
		String trimmed = str.trim().replaceAll(" +", " ");

		System.out.println(trimmed);
		
		
		
		

		
	}

}
