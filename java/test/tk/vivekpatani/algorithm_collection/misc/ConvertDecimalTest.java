/**
 * Vivek Patani {FlipSwitch}
 * ConvertDecimalTest.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.misc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class ConvertDecimalTest {
	
	ConvertDecimal convertDecimal;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		convertDecimal = new ConvertDecimal();
	}

	@Test
	public void testConvertToBinary1() {
		
		String result = convertDecimal.convertToBinary(128);
		
		assertEquals("10000000", result);
	}
	
	@Test
	public void testConvertToBinary2() {
		
		String result = convertDecimal.convertToBinary(1);
		
		assertEquals("1", result);
	}
	
	@Test
	public void testConvertToBinary3() {
		
		String result = convertDecimal.convertToBinary(7);
		
		assertEquals("111", result);
	}
	
	@Test
	public void testConvertToBinary4() {
		
		String result = convertDecimal.convertToBinary(9);
		
		assertEquals("1001", result);
	}
	
	@Test
	public void testConvertToOctal1() {
		
		String result = convertDecimal.convertToOctal(128);
		
		assertEquals("200", result);
	}
	
	@Test
	public void testConvertToOctal2() {
		
		String result = convertDecimal.convertToOctal(9999);
		
		assertEquals("23417", result);
	}
	
	@Test
	public void testConvertToOctal3() {
		
		String result = convertDecimal.convertToOctal(312434);
		
		assertEquals("1142162", result);
	}
	
	@Test
	public void testConvertToOctal4() {
		
		String result = convertDecimal.convertToOctal(1262432);
		
		assertEquals("4641540", result);
	}
	
	@Test
	public void testConvertToHex1() {
		
		String result = convertDecimal.convertToHex(126243212);
		
		assertEquals("786518C", result);
	}
	
	@Test
	public void testConvertToHex2() {
		
		String result = convertDecimal.convertToHex(1353632);
		
		assertEquals("14A7A0", result);
	}
	
	@Test
	public void testConvertToHex4() {
		
		String result = convertDecimal.convertToHex(1242534);
		
		assertEquals("12F5A6", result);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		convertDecimal = null;
	}

}
