/**
 * Vivek Patani {FlipSwitch}
 * MergeSortTest.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class MergeSortTest {

	private MergeSort testClass;
	@Test
	@Before
    public void setUp() {
        testClass = new MergeSort();
    }

    @Test
    public void bubbleSortEx1TestSuccess() {
        int[] numbers = new int[] { 1, 7, 99, 2, 0, 12, 15 };
        testClass.sort(numbers,0,numbers.length-1);

        assertArrayEquals(new int[] { 0, 1, 2, 7, 12, 15, 99 }, numbers);
    }

    @Test
    public void bubbleSortEx2TestSuccess() {
        int[] numbers = new int[] { 8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5 };
        testClass.sort(numbers,0,numbers.length-1);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 }, numbers);
    }

    @Test
    public void bubbleSortEx3TestSuccess() {
        int[] numbers = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        testClass.sort(numbers,0,numbers.length-1);

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, numbers);
    }
}
