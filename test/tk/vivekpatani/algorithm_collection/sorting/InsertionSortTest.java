/**
 * Vivek Patani {FlipSwitch}
 * InsertionSortTest.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class InsertionSortTest {

	private InsertionSort testClass;
	@Test
	@Before
    public void setUp() {
        testClass = new InsertionSort();
    }

    @Test
    public void insertionSortEx1TestSuccess() {
        
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	numbers.add(1);
    	numbers.add(7);
    	numbers.add(99);
    	numbers.add(2);
    	numbers.add(0);
    	numbers.add(12);
    	numbers.add(15);
    	
    	ArrayList<Integer> result = numbers;
        testClass.sort(numbers);
        
        Collections.sort(result);
        
        assertEquals(result, numbers);
    }

    @Test
    public void insertionSortEx2TestSuccess() {
        
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	numbers.add(8);
    	numbers.add(5);
    	numbers.add(3);
    	numbers.add(1);
    	numbers.add(9);
    	numbers.add(6);
    	numbers.add(0);
    	numbers.add(7);
    	numbers.add(4);
    	numbers.add(2);
    	numbers.add(5);
    	
    	testClass.sort(numbers);

        ArrayList<Integer> result = numbers;
        testClass.sort(numbers);
        
        Collections.sort(result);
        
        assertEquals(result, numbers);
    }

    @Test
    public void insertionSortEx3TestSuccess() {
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	numbers.add(10);
    	numbers.add(9);
    	numbers.add(8);
    	numbers.add(7);
    	numbers.add(6);
    	numbers.add(5);
    	numbers.add(4);
    	numbers.add(3);
    	numbers.add(2);
    	numbers.add(1);
    	numbers.add(0);
    	
    	testClass.sort(numbers);

        ArrayList<Integer> result = numbers;
        testClass.sort(numbers);
        
        Collections.sort(result);
        
        assertEquals(result, numbers);
    }
}
