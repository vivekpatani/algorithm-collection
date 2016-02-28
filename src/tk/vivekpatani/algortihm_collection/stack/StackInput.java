/**
 * Vivek Patani {FlipSwitch}
 * StackInput.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algortihm_collection.stack;

import java.util.ArrayList;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * All the types of Input for Stacks
 * Integer
 * String
 * Character
 * Object
 */
public class StackInput {
	
	private static String input;
	
	
	/**
	 * Method to return the Input Data - String
	 * @return 
	 */
	public ArrayList<String> stackInputString(ArrayList<String> inputData){
		
		//Take the input from user here
		System.out.println(ConstantsStack.OPTIONS_STACK_TYPE[1]);
		System.out.println(ConstantsMain.OPTION_EXIT);
		do {
			input = ConstantsMain.scanner.next();
			inputData.add(input);
		} while (input.equalsIgnoreCase(ConstantsMain.EXIT));
		
		return inputData;	
	}
	
	/**
	 * Method to return the Input Data - Characters
	 * @return
	 */
	public ArrayList<Character> stackInputChar(){
		
		ArrayList<Character> inputData = new ArrayList<>();
		
		//Take the input from user here
		System.out.println(ConstantsStack.OPTIONS_STACK_TYPE[2]);
		System.out.println(ConstantsMain.OPTION_EXIT);
		do {
			input = ConstantsMain.scanner.next();
			if(input.equalsIgnoreCase(ConstantsMain.EXIT)){
				// Do Nothing
			} else inputData.add(input.charAt(0));
		} while (input.equalsIgnoreCase(ConstantsMain.EXIT));
		
		return inputData;	
	}
	
	//Implementation for Object Remains
}