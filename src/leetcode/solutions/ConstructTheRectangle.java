package leetcode.solutions;

public class ConstructTheRectangle {

	public static void main(String[] args) {
		
		int[] output1 = buildRectangleOne(8);
		System.out.println(output1[0] + " : " + output1[1]);
		
		int[] output2 = buildRectangleTwo(2);
		System.out.println(output2[0] + " : " + output2[1]);
	}

	public static int[] buildRectangleOne(int area) {

		int[] output = new int[2];

		if (area == 1) {
			output[0] = 1;
			output[1] = 1;
			return output;
		}

		output[0] = 1;
		output[1] = area;

		for (int length = 0; length <= area; length++) {
			for (int width = 0; width <= length; width++) {
				if ((length * width) == area) {
					// System.out.println("Entered");
					if (Math.abs(length - width) <= Math.abs(output[0] - output[1])) {
						output[0] = length;
						output[1] = width;
					}
				}
			}
		}

		return output;
	}
	
	public static int[] buildRectangleTwo (int area) {
		
		int[] output = new int[2];
		
		output[0] = 1;
		output[1] = area;
		
		System.out.println(Math.ceil(Math.sqrt(area)));
		int length = 0;
		
		for (int width = 1; width <= Math.ceil(Math.sqrt(area)); width++) {
			
			length = area/width;
			
			if ((length * width) == area && Math.abs(length - width) <= Math.abs(output[0] - output[1]) && length >= width) {
				output[0] = length;
				output[1] = width;
			}
		}
		
		return output;
	}

}
