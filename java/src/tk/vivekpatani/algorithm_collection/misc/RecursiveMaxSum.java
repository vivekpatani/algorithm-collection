/**
 * Vivek Patani {FlipSwitch}
 * RecursiveMaxSum.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.misc;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * Write a recursive function: 
 * int sum( int x, int max ) 
 * { 
 * complete the code *
 * } 
 * that calculates the sum of the numbers from x to max (inclusive). For example, sum (4, 7) would compute 4 + 5 + 6 + 7 and return the value 22. The function must be recursive so you are not allowed to use any conventional loop constructs
 */
public class RecursiveMaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Please Enter The Lower Bound: ");
		int lower = ConstantsMain.scanner.nextInt();
		
		System.out.println("Please Enter The Lower Bound: ");
		int upper = ConstantsMain.scanner.nextInt();
		
		int final_sum = sum(lower,upper);
		
		System.out.println("Sum: "+final_sum);
	}
	
	public static int sum (int lower, int upper){
		
		if(lower == upper) return upper;
		else return lower+sum(lower+1,upper);
	}

}
