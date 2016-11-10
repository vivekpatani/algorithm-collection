/**
 * Vivek Patani {FlipSwitch}
 * SimpleDivisionTest.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vivekpatani.calculator.SimpleDivision;

/**
 * 
 */
public class SimpleDivisionTest {

	/**
	 * Test method for {@link com.vivekpatani.calculator.SimpleDivision#SimpleDivision(float, float, java.lang.String)}.
	 */
	@Test
	public void testSimpleDivision() {
		SimpleDivision callSimpleDivision = new SimpleDivision(100,10,ConstantsCalculator.CALCULATOR_OPTIONS[3]);
		double actualResult1 =  10.0;
		double actualResult2 = 0.1;
		assertEquals(actualResult1,callSimpleDivision.getResult1(),0.0);
		assertEquals(actualResult2, callSimpleDivision.getResult2(),0.0);
//		boolean actualResult = true;
//		assertEquals(actualResult,callSimpleDivision.getZeroResult());
	}

}
