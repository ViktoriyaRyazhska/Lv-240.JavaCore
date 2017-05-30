package birds;

public class App {

	public static void main(String[] args) {
		Bird[] birds = new Bird[4];

		birds[0] = new Eagle("Eagle","beautiful and precious","on the top of the mountains");
		birds[1] = new Swallow("Swallow","black and white","in the clay home");
		birds[2] = new Penguin("Penguin","black and warm","in the iceland");
		birds[3] = new Chicken("Chicken","white and small","is my purpose");

		for (int i = 0; i < birds.length; i++) {
			System.out.println (birds[i]);
			
			birds[i].fly();
	}
        
}}
