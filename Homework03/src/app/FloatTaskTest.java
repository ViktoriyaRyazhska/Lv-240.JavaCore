package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloatTaskTest {
	FloatTask f = new FloatTask();
	
	@Test
	public void testBelongToRange() {
		assertTrue(true==f.belongToRange(4.1f, 2.1f, 3.5f));
	}
	@Test
	public void testBelongToRange2() {
		assertTrue(false==f.belongToRange(6.1f, 2.1f, 3.5f));
	}

}
