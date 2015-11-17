/**
 * Vivek Patani {FlipSwitch}
 * SimpleMultiplicationTest.java
 * {Algorithms 0.: Living in Beta}
 */
package com.vivekpatani.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vivekpatani.Constants.Constants;
import com.vivekpatani.calculator.SimpleMultiplication;

/**
 * 
 */
public class SimpleMultiplicationTest {

	@Test
	public void test() {
		SimpleMultiplication callSimpleMultiplication = new SimpleMultiplication(8,3,Constants.CALCULATOR_OPTIONS[3]);
		double actualResult =  24.0;
		assertEquals(actualResult,callSimpleMultiplication.getResult(),0);
	}
}