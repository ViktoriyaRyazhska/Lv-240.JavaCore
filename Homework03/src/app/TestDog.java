package app;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Dog.Breed;

public class TestDog {

	Dog d1 = new Dog("Kit", 12, Breed.PitBull);	
	Dog d2 = new Dog("Nord", 2, Breed.Chihuahua);
	Dog d3 = new Dog("Lassie", 10, Breed.Bulldog);
	
	
	@Test
	public void testAge() {
		assertEquals(d1,Dog.oldestDog(d1, d2, d3));
		
	}
	@Test
	public void testSameNames() {
		assertTrue(false==Dog.checkNames(d1, d2, d3));
		
	}

}
