/**
 * Vivek Patani {FlipSwitch}
 * StringBalance.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.misc;

import java.util.Stack;

/**
 * 
 */
public class ParanthesisBalance {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(stringBalance("{({}"));
		System.out.println(stringBalance("({[]})"));
		System.out.println(stringBalance("([)]"));
	}
	
	/**
	 * @param input
	 * @return
	 */
	public static boolean stringBalance(String input){
		
		if(input.length() == 0) return false;
		
		Stack<Character> stack = new Stack<Character>();
		
		int length = input.length();
		for (int i=0; i<length;i++){
				if(input.charAt(i)=='('){
					stack.push(input.charAt(i));
					System.out.println("Stack Push: "+input.charAt(i));
				} else if(input.charAt(i) == '['){
					stack.push(input.charAt(i));
					System.out.println("Stack Push: "+input.charAt(i));
				} else if(input.charAt(i)=='{'){
					stack.push(input.charAt(i));
					System.out.println("Stack Push: "+input.charAt(i));
				} else if(input.charAt(i)==')'){
					System.out.println("Probable Char Pop: "+input.charAt(i));
					if (stack.size()==0) return false;
					if (stack.pop()!='(') return false;
				} else if(input.charAt(i)==']'){
					System.out.println("Probable Char Pop: "+input.charAt(i));
					if (stack.size()==0) return false;
					if (stack.pop()!='[') return false;
				} else if(input.charAt(i)=='}'){
					System.out.println("Probable Char Pop: "+input.charAt(i));
					if (stack.size()==0) return false;
					if (stack.pop()!='{') return false;
				}
			}
		return stack.isEmpty();
		}
	}