package interviews.mathworks;

public class ReverseWordsInASentence {

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(reverseWordsInASentence("Vivek is the best!"));
	}
	
	/**
	 * Reverse each word in a sentence
	 * @param input
	 * @return
	 */
	public static String reverseWordsInASentence(String input) {
		
		String[] words = input.split(" ");
		StringBuilder output = new StringBuilder();
		for (String word: words) {
			output.append(reverseWord(word) + " ");
		}
		
		output.deleteCharAt(output.length() - 1);
		return output.toString();
	}
	
	/**
	 * Reverse Each Word
	 * @param word
	 * @return
	 */
	public static String reverseWord(String word) {
		
		StringBuilder input = new StringBuilder(word);
		int i = 0;
		int j = word.length() - 1;
		while (i < j) {
			char temp = input.charAt(i);
			input.setCharAt(i, input.charAt(j));
			input.setCharAt(j, temp);
			i++;
			j--;
		}
		
		return input.toString();
	}
	
	/**
	 * To display an array
	 * @param input
	 */
	public static void display (String[] input) {
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
