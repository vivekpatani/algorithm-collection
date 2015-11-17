/**
 * Vivek Patani {FlipSwitch}
 * SimpleModuloTest.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vivekpatani.calculator.SimpleModulo;
import com.vivekpatani.constants.Constants;

/**
 * 
 */
public class SimpleModuloTest {

	/**
	 * Test method for {@link com.vivekpatani.calculator.SimpleModulo#SimpleModulo(int, int, java.lang.String)}.
	 */
	@Test
	public void testSimpleModulo() {
		SimpleModulo callSimpleModulo = new SimpleModulo(8,3,Constants.CALCULATOR_OPTIONS[4]);
		int actualResult1 =  2;
		int actualResult2 = 3;
		assertEquals(actualResult1,callSimpleModulo.getResult1(),0);
		assertEquals(actualResult2, callSimpleModulo.getResult2(),0);
	}

}
