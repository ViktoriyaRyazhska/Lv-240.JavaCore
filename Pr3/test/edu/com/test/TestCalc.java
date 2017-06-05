package edu.com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.com.app.Calc;

public class TestCalc {
	
	Calc calc = new Calc();
	
	@Test
	public void testAdd() {
		assertTrue(5 == calc.add(2, 3));
	}
	
	@Test
	public void testDiv() {
		assertEquals(7,calc.div(35, 5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivZero() {
		assertEquals(0,calc.div(35, 0));
	}
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test");
	}


}
