package homework3_2;
/**
 * Holds information about dog.
 */
	public class Dog{
		public enum Breeds{
			Pug, Labrador, Beagle, Rottweiler, Poodle, Bulldog, Boser, Duchshund,
		}
		private String name;
		private String breed;
		private int age;
		
		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getBreed() {
	        return breed;
	    }

	    public void setBreed(String breed){
	    	this.breed = breed;
	    }
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age){
	    	this.age = age;
	    }
	}
