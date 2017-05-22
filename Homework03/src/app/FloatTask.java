package app;

public class FloatTask {
	public boolean belongToRange(float f1, float f2, float f3) {

		if (-5 <= f1 && f1 <= 5 && -5 <= f2 && f2 <= 5 && -5 <= f3 && f3 <= 5) {
			System.out.println("All floats belong to the range [-5;5]");
			return true;
		} else {
			System.out.println("Not all floats belong to the range [-5;5]");
			return false;
		}

	}
	public static void main(String[] args) {
		FloatTask f = new FloatTask();
		f.belongToRange(1, 2.3f, 5.6f);	
		
	}

}