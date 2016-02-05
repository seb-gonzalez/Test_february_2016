//Sebastian Gonzalez - Metapack Assignment 05/02/2016
package Metapack_tests;

import Assingment.Accumulator;
import Assingment.Accumulator_imp;
import junit.framework.TestCase;

public class MyTests extends TestCase {
	private Accumulator tester;
	
	public void setUp() {
		this.tester = new Accumulator_imp();
	}
	
	public void tearDown() {
		this.tester = null;
	}	

	public void testPartialAccumulation() {
		int result = tester.accumulate(1, 2, 3);
		int expected = 6;
		
		assertTrue(expected == result);
	}

	public void testTotalAccumulation() {
		tester.accumulate(1, 2, 3);
		tester.accumulate(4);
		
		int result = tester.getTotal();
		int expected = 10;
		
		assertTrue(expected == result);
	}

	public void testResetAccumulation() {
		tester.accumulate(1, 2, 3);
		tester.accumulate(4);
		
		assertTrue(10 == tester.getTotal());
		
		tester.reset();
		
		assertTrue(0 == tester.getTotal());
	}
}
