package app;

public class Dog {
	private String name;
	private int age;

	public enum Breed {
		PitBull, Hound, Chihuahua, Bulldog
	}

	private Breed breed;

	public Dog() {
	}

	public Dog(String name, int age, Breed breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	public String toStringNameBreed() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}

	public boolean sameNames(Dog dog) {

		if (this.getName().equals(dog.getName())) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkNames(Dog d1, Dog d2, Dog d3) {
		if (d1.sameNames(d2) || d1.sameNames(d3) || d2.sameNames(d3)) {
			System.out.println("There are dogs with the same names");
			return true;
		} else {
			System.out.println("There are no dogs with the same names");
			return false;
		}

	}

	public boolean checkAge(Dog dog) {
		if (dog.getAge() < this.age) {
			return true;
		} else {
			return false;
		}
	}

	public static Dog oldestDog(Dog d1, Dog d2, Dog d3) {
		if (d1.checkAge(d2) && d1.checkAge(d3)) {
			return d1;
		} else if (d2.checkAge(d1) && d2.checkAge(d3)) {
			return d2;
		} else {
			return d3;
		}

	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("Jack");
		d1.setAge(12);
		d1.setBreed(Breed.Hound);
		Dog d2 = new Dog("Nord", 2, Breed.Chihuahua);
		Dog d3 = new Dog("Lassie", 10, Breed.Bulldog);
		Dog.checkNames(d1, d2, d3);
		Dog.oldestDog(d1, d2, d3);
		System.out.println("The oldest dog is " + Dog.oldestDog(d1, d2, d3).toStringNameBreed());

	}

}
