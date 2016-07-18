/**
 * Vivek Patani {FlipSwitch}
 * SelectionSortTest.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class SelectionSortTest {
	
	private SelectionSort testClass;
	@Test
	@Before
    public void setUp() {
        testClass = new SelectionSort();
    }

    @Test
    public void selectionSortEx1TestSuccess() {
        int[] numbers = new int[] { 1, 7, 99, 2, 0, 12, 15 };
        testClass.sort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 7, 12, 15, 99 }, numbers);
    }

    @Test
    public void selectionSortEx2TestSuccess() {
        int[] numbers = new int[] { 8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5 };
        testClass.sort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }, numbers);
    }

    @Test
    public void selectionSortEx3TestSuccess() {
        int[] numbers = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        testClass.sort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, numbers);
    }
}
