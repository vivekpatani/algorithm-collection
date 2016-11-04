package careercup.facebook;

public class SpokenNumber {

	public static void main(String[] args) {

		System.out.println(toText(900));

	}

	public static String toText (int number) {
		
		StringBuilder output = new StringBuilder();
		
		String[] base = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten"};
		String[] teens = new String[] {"Eleven" , "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] power = new String[] {"Hundred", "Thousand", "Million", "Billions" };
		
		int length = Integer.toString(number).length();
		
		if ((length % 3) + 1 == 1) {
			output.append(base[Character.getNumericValue(Integer.toString(number).charAt(0))]);
		}
		
		return output.toString();
	}
}
