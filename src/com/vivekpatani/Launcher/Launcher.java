package com.vivekpatani.Launcher;

import com.vivekpatani.Constants.*;

public class Launcher {

	//Necessary Declaration of Variable that we'd need.
	private static String userName;
	private static String userOption;
	/*
	 * This is the main driver method of the complete program
	 */
	public static void main(String[] args) {
		
		System.out.println(Constants.WELCOME_MESSAGE);
		System.out.println(Constants.USERNAME_QUERY);
		userName = Constants.sc.next();
		
		System.out.println(Constants.HELLO_TEXT + userName + Constants.OPTION_SELECT);
		
		for (int i = 0; i < Constants.OPTIONS.length; i++) {
			System.out.print(Constants.OPTIONS[i]);
		}
		
		userOption = Constants.sc.next();
		
		switch (userOption) {
	
			case "1": {
				System.out.println("Option 1");
		
			}
			default: System.out.println("Err! Incorrect Input");
	
		}
	}
}
