import java.time.LocalDate;

class DogData {

	public enum breed {
		labrador, husky, companion, herding, hound

	}

	// constructor
	public DogData(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	// variables
	private String name;
	private String breed;
	private int age;

	// getters/setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// methods
	void output() {

		System.out.println("Dogs name is: " + name + " .Breed: " + breed + "  And he is " + age + " years old. ");

	}

	public static class Dog {

		public static void main(String[] args) {
			DogData dog1 = new DogData("Fox", "hound", 152);
			DogData dog2 = new DogData("Fox", "husky", 42);
			DogData dog3 = new DogData("Monster", "labrador", 1112);

			if (dog1.name.equals(dog2.name)) {
				System.out.println("Dog`s 1 & 2 names are the same .");
			} else if (dog1.name.equals(dog3.name)) {
				System.out.println("Dog`s 2 & 3 names are the same .");
			} else {
				System.out.println("Names are not the same.");
			}

			if ((dog1.age) > (dog2.age) && (dog1.age) > (dog3.age)) {
				System.out.println("Dog`s 1 is the oldest.");
				// Dogs dog1.output();
			} else if ((dog2.age) > (dog1.age) && (dog2.age) > (dog3.age)) {
				System.out.println("Dog`s 2 is the oldest.");
			} else if ((dog3.age) > (dog1.age) && (dog3.age) > (dog1.age)) {
				System.out.println("Dog`s 3 is the oldest.");

			}
		}
	}
}
