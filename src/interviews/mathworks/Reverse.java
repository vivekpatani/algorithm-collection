package interviews.mathworks;

public class Reverse {
	
	public static void main(String[] args) {
		
		String input = new String("Vivek  Is the best");
		StringBuilder output = new StringBuilder();
		
		
		for (int i = input.length() - 1; i >= 0; i--) {
			output.append(input.charAt(i));
		}
		
		System.out.println(output.toString());
		divisor();
	}
	
	public static void divisor () {
		for (int i = 1; i < 101; i++) {
			
			if (i % 7 == 0 && i % 3 != 0) System.out.println(i);
		}
	}
}
