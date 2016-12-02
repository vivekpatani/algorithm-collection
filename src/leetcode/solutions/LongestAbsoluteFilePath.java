package leetcode.solutions;

public class LongestAbsoluteFilePath {

	public static void main(String[] args) {
		System.out.println(lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
		System.out.println(lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
		
	}

	public static int lengthLongestPath(String input) {
		
		String[] parsedInput = input.split("\n");
		
		int count = 0;
		StringBuilder output = new StringBuilder();
		int max = Integer.MIN_VALUE;
		int tabs = 0;
		
		for (String pathElement: parsedInput) {
			
			tabs = numberOfTabSpaces(pathElement);
			
			if (tabs == 0 && tabs == 0) {
				output.append(pathElement.trim() + "/");
				count++;
				continue;
			}
			
			// If it s a file
			if (pathElement.contains(".")) {
				String temp = new String(output.toString() + "/" + pathElement.trim());
				System.out.println(temp + "     File");
				if (temp.length() > max) max = temp.length();
			}
			
			
			else if (tabs == count) {
				count++;
				output.append(pathElement.trim() + "/");
				System.out.println(output + "      Incrementing   " + numberOfTabSpaces(pathElement));
				
			} else if (tabs < count){
				count--;
				int start = output.lastIndexOf("/");
				System.out.println(output + "           Decrementing  " + numberOfTabSpaces(pathElement));
				if (start >= 0) output.replace(output.substring(0,output.length()).lastIndexOf("/"), output.length(), "");
			}
			//System.out.println(output);
		}
		
		return max;
	}
	
	public static int numberOfTabSpaces (String input) {
		
		int counter = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if ("\t".equals(""+input.charAt(i))) counter++;
		}
		
		return counter;
	}
	
	public static void display (String[] input) {
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}
}
