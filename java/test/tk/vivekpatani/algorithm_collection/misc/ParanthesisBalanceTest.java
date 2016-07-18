/**
 * Vivek Patani {FlipSwitch}
 * StringBalanceTest.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.misc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class ParanthesisBalanceTest {
	
	private ParanthesisBalance testStringBalance;
	
	@Test
	@Before
	public void setUp(){
		testStringBalance = new ParanthesisBalance();
	}
	
	@Test
	public void testNull() {
		String input = "";
		boolean result = testStringBalance.stringBalance(input);
		
		assertEquals(false, result);
	}
	
	@Test
	public void testUnEqual() {
		String input = "{{{{[[[[[[[]}))()ABCD()";
		boolean result = testStringBalance.stringBalance(input);
		
		assertEquals(false, result);
	}
	
	@Test
	public void testUnEqual2() {
		String input = "{[}]";
		boolean result = testStringBalance.stringBalance(input);
		
		assertEquals(false, result);
	}
	
	@Test
	public void equal() {
		String input = "{([])}";
		boolean result = testStringBalance.stringBalance(input);
		
		assertEquals(true, result);
	}
	
	@Test
	public void equallyUnequal() {
		String input = "{{(([]}})";
		boolean result = testStringBalance.stringBalance(input);
		
		assertEquals(false, result);
	}

}
