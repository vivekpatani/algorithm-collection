/**
 * Vivek Patani {FlipSwitch}
 * SimpleAdditionTest.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vivekpatani.Constants.Constants;
import com.vivekpatani.calculator.SimpleAddition;

/**
 * 
 */
public class SimpleAdditionTest {

	/**
	 * Test method for {@link com.vivekpatani.calculator.SimpleAddition#SimpleAddition(float, float, java.lang.String)}.
	 */
	@Test
	public void testSimpleAddition() {
		SimpleAddition callSimpleAddition = new SimpleAddition (12,12,Constants.CALCULATOR_OPTIONS[0]);
		double actualResult =  24.0;
		assertEquals(actualResult,callSimpleAddition.getResult(),0.0);
	}
}
