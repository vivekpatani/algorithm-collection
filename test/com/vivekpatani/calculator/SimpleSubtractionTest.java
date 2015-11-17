/**
 * Vivek Patani {FlipSwitch}
 * SimpleSubtractionTest.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vivekpatani.calculator.SimpleSubtraction;
import com.vivekpatani.constants.Constants;

/**
 * 
 */
public class SimpleSubtractionTest {

	@Test
	public void testSimpleSubraction() {
		SimpleSubtraction callSimpleSubtraction = new SimpleSubtraction (5499,99,Constants.CALCULATOR_OPTIONS[0]);
		double actualResult =  5400.0;
		assertEquals(actualResult,callSimpleSubtraction.getResult(),0.0);
	}
}

