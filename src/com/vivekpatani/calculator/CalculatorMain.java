package com.vivekpatani.calculator;
import com.vivekpatani.Constants.*;

public class CalculatorMain {
	
	private static int userOption;
	private static float userInput1, userInput2, result;
	
	public CalculatorMain() {
		for (int i = 0; i < Constants.CALCULATOR_OPTIONS.length - 1; i++) {
			System.out.println(Constants.CALCULATOR_OPTIONS[i]);
		}
			 userOption = Constants.sc.nextInt();
			 getInput();
			 
			 if (userOption == 1){
				 callAddition();
			 }
			 else if (userOption == 2){
				 callSubtraction();
			 }
			 else if (userOption == 3){
				 callMultiplication();
			 }
			 else if (userOption == 4){
				 callDivision();
			 }
			 else if (userOption == 5){
				 callModulo();
			 }
			 else {
				 System.out.println(Constants.ERROR_MESSAGE_INPUT);
			 }
		}
	
	private static void callAddition () {
			SimpleAddition simpleAdditionCall = new SimpleAddition(userInput1,userInput2,Constants.CALCULATOR_OPTIONS[0]);
	}
	private static void callSubtraction () {
		SimpleSubtraction simpleSubtractionCall = new SimpleSubtraction(userInput1,userInput2,Constants.CALCULATOR_OPTIONS[1]);
	}
	private static void callMultiplication () {
		SimpleMultiplication simpleMultiplicationCall = new SimpleMultiplication(userInput1, userInput2, Constants.CALCULATOR_OPTIONS[2]);
	}
	private static void callDivision () {
		
		if(zeroErrorHandler(userInput1,userInput2)) {
			System.out.println(Constants.ERROR_MESSAGE_OTHER);
		} else {
			SimpleDivision simpleDivisionCall = new SimpleDivision(userInput1, userInput2, Constants.CALCULATOR_OPTIONS[3]);
		}
	}
	private static void callModulo () {
		
		SimpleModulo simpleModuloCall = new SimpleModulo(userInput1, userInput2, Constants.CALCULATOR_OPTIONS[4]);
		}
	private static void getInput () {
		
		System.out.println(Constants.CALCULATOR_OPTIONS[5]);
		userInput1 = Constants.sc.nextInt();
		System.out.println();
		userInput2 = Constants.sc.nextInt();
		
	}
	
	private static boolean zeroErrorHandler(float userInput1, float userInput2){
		if (userInput1 == 0 || userInput2 == 0) return true;
		else return false;
	}
}
