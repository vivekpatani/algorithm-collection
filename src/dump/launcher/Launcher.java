package dump.launcher;

import dump.calculator.CalculatorMain;
import dump.commonconstants.Constants;

public class Launcher {

	// Necessary Declaration of Variable that we'd need.
	private static String userName;
	private static int userOption;

	/*
	 * This is the main driver method of the complete program
	 */
	public static void main(String[] args) {

		System.out.println(ConstantsLauncher.WELCOME_MESSAGE);
		System.out.println(ConstantsLauncher.USERNAME_QUERY);
		userName = Constants.sc.next();

		System.out.println(ConstantsLauncher.HELLO_TEXT + userName + "!" + Constants.OPTION_SELECT);

		for (int i = 0; i < ConstantsLauncher.OPTIONS.length; i++) {
			System.out.print(ConstantsLauncher.OPTIONS[i]);
		}

		userOption = Constants.sc.nextInt();

		switch (userOption) {

		case 1: {
			System.out.println();
			CalculatorMain calculatorCall = new CalculatorMain();
			break;
		}

		default:
			System.out.println(Constants.ERROR_MESSAGE_OTHER);
		}
	}
}