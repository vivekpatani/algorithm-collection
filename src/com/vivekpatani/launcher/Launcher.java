package com.vivekpatani.launcher;

import com.vivekpatani.calculator.CalculatorMain;
import com.vivekpatani.constants.*;

public class Launcher {

	//Necessary Declaration of Variable that we'd need.
	private static String userName;
	private static int userOption;
	/*
	 * This is the main driver method of the complete program
	 */
	public static void main(String[] args) {
		
		System.out.println(Constants.WELCOME_MESSAGE);
		System.out.println(Constants.USERNAME_QUERY);
		userName = Constants.sc.next();
		
		System.out.println(Constants.HELLO_TEXT + userName + "!" + Constants.OPTION_SELECT);
		
		for (int i = 0; i < Constants.OPTIONS.length; i++) {
			System.out.print(Constants.OPTIONS[i]);
		}
		
		userOption = Constants.sc.nextInt();
		
		switch (userOption) {
	
			case 1: {
				System.out.println();
				CalculatorMain calculatorCall = new CalculatorMain();
				break;
			}
			
			default: System.out.println(Constants.ERROR_MESSAGE_OTHER);
		}
	}
}