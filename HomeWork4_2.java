package HomeWork4;

public class Dog {
	private String name; 
	private String breed; 
	private int age;
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "name-" + name + ", breed-" + breed + ", age-" + age + "";
	} 

	public boolean equalsName(Dog dog) {
		if (getName() == dog.getName()) return true;
		else return false;
	}

	
	
}

package HomeWork4;

public class task2 {

	public static void main(String[] args) {

	Dog dog1=new Dog("Tuzik", "Rottweiler", 5);
	Dog dog2=new Dog("Sharik", "Labrador", 8);
	Dog dog3=new Dog("Tuzik", "Doberman", 3);
	
	if (dog1.equalsName(dog3)) {System.out.println("1 and 3 dogs with the same name");}
	if (dog1.equalsName(dog2)) {System.out.println("1 and 2 dogs with the same name");}
	if (dog2.equalsName(dog3)) {System.out.println("2 and 3 dogs with the same name");}
	
    if (dog1.getAge()>dog2.getAge() && dog1.getAge()>dog3.getAge()) 
    {System.out.println("The oldest dog: "+dog1);} 
    else {if (dog2.getAge()>dog1.getAge() && dog2.getAge()>dog3.getAge()) 
    	{System.out.println("The oldest dog: "+dog2);}
    	else {System.out.println("The oldest dog: "+dog3);}
    } 
		
	}

}

package HomeWork4;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	Dog dog=new Dog("name", "breed", 1);
	
	@Test
	public void testGetName() {
		assertTrue("name"==dog.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(1,dog.getAge());
	}
	
	@Test (expected = ArithmeticException.class)
	public void testNotGetAge() {
		assertEquals(0,dog.getAge()/0);
	}
}
