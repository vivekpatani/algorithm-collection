/**
 * Vivek Patani {FlipSwitch}
 * StackMain.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algortihm_collection.stack;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * 
 */
public class StackMain {
	
	private static int optionSelect = 0;
	public static void main(String[] args){
		
		//Call to init to use it independantly
		init();
	}
	
	public static int init(){
		
		System.out.println(ConstantsStack.OPTIONS_STACK[0]);
		System.out.println(ConstantsStack.OPTIONS_STACK[1]);
		System.out.println(ConstantsStack.OPTIONS_STACK[2]);
		System.out.println(ConstantsStack.OPTIONS_STACK[3]);
		System.out.println(ConstantsStack.OPTIONS_STACK[4]);
		System.out.println(ConstantsStack.OPTIONS_STACK[5]);
		
		optionSelect = ConstantsMain.scanner.nextInt();
		
		switch(optionSelect){
		case 1:{
			
		}
		}
		
		return 0;
	}

}
