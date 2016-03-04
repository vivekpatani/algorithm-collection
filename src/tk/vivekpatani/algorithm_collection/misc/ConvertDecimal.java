/**
 * Vivek Patani {FlipSwitch}
 * ConvertDecimal.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.misc;

/**
 * 
 */
public class ConvertDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Result: "+convertToBinary(128));
		System.out.println("Result: "+convertToOctal(128));
	}
	
	public static String convertToBinary(int n){
		
		int bin;
		int result = 0;
		String fin = "";
		while (n!=0){
			bin = n%2;
			fin = Integer.toString(bin) + fin;
			n = n/2;
		}
		return fin;
	}
	
	public static String convertToOctal(int n){
		
		int bin;
		int result = 0;
		String fin = "";
		while (n!=0){
			bin = n%8;
			fin = Integer.toString(bin) + fin;
			n = n/8;
		}
		return fin;
	}
	
	public static String convertToHex(long n){
		
		long bin;
		long result = 0;
		String fin = "";
		while (n!=0){
			bin = n%16;
			if(bin==10) fin = "A" + fin;
			else if(bin==11) fin = "B" + fin;
			else if(bin==12) fin = "C" + fin;
			else if(bin==13) fin = "D" + fin;
			else if(bin==14) fin = "E" + fin;
			else if(bin==15) fin = "F" + fin;
			else fin = Long.toString(bin) + fin;
			n = n/16;
		}
		return fin;
	}

}
