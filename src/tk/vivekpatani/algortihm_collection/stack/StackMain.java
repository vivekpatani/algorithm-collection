/**
 * Vivek Patani {FlipSwitch}
 * StackMain.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algortihm_collection.stack;

import java.util.Arrays;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * 
 */
public class StackMain {
	
	public void init(){
		initIntStack();
	}
	
	public void initIntStack(){
		
		//Initialise the input variable to zero
		int input = 0;
		
		//Instance of the Integer Stack
		StackInteger stackInt = new StackInteger();
		
		//Display All Options
		System.out.println(Arrays.toString(ConstantsStack.OPTIONS_STACK_INT));
		
		//While the user does not exit (Enter 7 as input) The loop keeps on running.
		while(input!=7){
			
			//Take the input at the start of each iteration.
			System.out.println("Input:");
			input = ConstantsMain.scanner.nextInt();
			
			if(input==1){
				//Function to perform push operation
				System.out.println("Push an Element:");
				stackInt.push(ConstantsMain.scanner.nextInt());
			} else if(input==2){
				
				//Function to pop an element
				System.out.println(stackInt.pop());
			} else if(input==3){
				System.out.println("At the top of the Stack is:"+stackInt.peek());
			} else if(input==4){
				System.out.println("Multi - pop: "+stackInt.multipop());
				System.out.println("Popped All Elements.");
			} else if(input==5){
				System.out.println(stackInt.destroyArray());
				System.out.println("Array Destroyed!");
			} else if(input==6){
				//Do nothing
				System.out.println(ConstantsMain.EXIT);
			} else {
				//An Unknown input by the user
				System.out.println("Err!");
			}
		}
	}
}
