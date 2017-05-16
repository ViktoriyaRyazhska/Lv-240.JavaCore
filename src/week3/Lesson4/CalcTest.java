package week3.Lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	
	Calc calc = new Calc();
	
	@Test
	public void testAdd() {
		assertTrue(5 == calc.add(2, 3));
		
//		fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		assertEquals(7, calc.div(35, 5));
		
		//fail("Not yet implemented");
	}
	
	@Test (expected = ArithmeticException.class)
	public void testDivZero() {
		assertEquals(0, calc.div(35, 0));
	}

}
