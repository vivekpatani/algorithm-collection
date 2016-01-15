/**
 * Vivek Patani {FlipSwitch}
 * Main.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.main;

//Imports made to check the CPU Load
import java.text.NumberFormat;

import tk.vivekpatani.algortihm_collection.stack.StackMain;


/**
 * The Driver Class for the whole program
 */
public class Main {
	
	//The optionSelect variable is the option input by user
	private static int optionSelect;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// This is the welcome message.
		System.out.println("=====================================================================");
		System.out.println("||                                                                 ||");
		System.out.println("||                                                                 ||");
		System.out.println("||                        Welcome to this side!                    ||");
		System.out.println("||                                                                 ||");
		System.out.println("||                                                                 ||");
		System.out.println("=====================================================================");
		
		//The code begins here
		
		optionChooser();
		
		// Ciao Message.
		System.out.println("=====================================================================");
		System.out.println("||                                                                 ||");
		System.out.println("||                                                                 ||");
		System.out.println("||                        See you soon, buddy!!                    ||");
		System.out.println("||                                                                 ||");
		System.out.println("||                                                                 ||");
		System.out.println("=====================================================================");
	}
	
	private static void optionChooser(){
		
		do {
			System.out.println("Choose your option, choose it wisely");
			System.out.println(ConstantsMain.OPTIONS_MAIN[0]);
			System.out.print(ConstantsMain.OPTIONS_MAIN[1]);
			
			//Asking the user for their options
			optionSelect = ConstantsMain.scanner.nextInt();
			
			switch(optionSelect){
			
			case 0: {
				//Exit Case, Do nothing.
				break;
			}
			
			case 1: {
				System.out.println("Option 1: Stack");
				StackMain.init();
				break;
			}
			
			default: System.out.println("Err! Bad Input!");
			}
			
			System.out.println("\n\n"+ConstantsMain.CPU_LOAD + getCpuLoad());
			
		} while(optionSelect != 0);
	}
	
	/**
	 * This is is to get the CPU Load on a machine
	 * @return
	 */
	private static StringBuilder getCpuLoad() {
		Runtime runtime = Runtime.getRuntime();

		NumberFormat format = NumberFormat.getInstance();

		StringBuilder memoryStats = new StringBuilder();
		long maxMemory = runtime.maxMemory();
		long allocatedMemory = runtime.totalMemory();
		long freeMemory = runtime.freeMemory();

		memoryStats.append("\nFree Memory: " + format.format(freeMemory / 1024) + "\n");
		memoryStats.append("Allocated Memory: " + format.format(allocatedMemory / 1024) + "\n");
		memoryStats.append("Max Memory: " + format.format(maxMemory / 1024) + "\n");
		memoryStats.append("Total Free Memory: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / 1024) + "\n");
		
		return memoryStats;
	}
}
