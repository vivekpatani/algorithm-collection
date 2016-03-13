/**
 * Vivek Patani {FlipSwitch}
 * ImplementArrayMultiplication.java
 * {Algorithms 0.: Living in Beta}
 */
package tk.vivekpatani.algorithm_collection.misc;

import tk.vivekpatani.algorithm_collection.main.ConstantsMain;

/**
 * 
 */
public class ImplementArrayMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter the First Number");
		long number1 = ConstantsMain.scanner.nextLong();
		String n1 = String.valueOf(number1);
		int[] num1 = converToArray(n1);
		
		System.out.println("Enter the First Number");
		long number2 = ConstantsMain.scanner.nextLong();
		String n2 = String.valueOf(number2);
		int[] num2 = converToArray(n2);
		
		int carry = 0;
		String result = "";
		int c[] = new int [1000];
		for (int i = num1.length-1; i >=0; i--) {
			carry = 0;
			for (int j = num2.length-1; j >=0 ; j--) {
				int t = (num1[j] * num2[i]) + c[i+j] + carry;
                carry = t/10;
                c[i+j] = t%10;
			}
			result = result + Integer.toString(c[i]);
		}
		System.out.println(result);
		long res = number1*number2;
		System.out.println("Result: "+multiply(n1,n2));

	}
	
	static String multiply(String t1,String t2)
    {

        if(t1.length()>1&&t2.length()>1)
        {
            int mid1=t1.length()/2;
            int mid2=t2.length()/2;
            String a=t1.substring(0, mid1);//Al
            String b=t1.substring(mid1, t1.length());//Ar
            String c=t2.substring(0, mid2);//Bl
            String d=t2.substring(mid2, t2.length());//Br
            String s1=multiply(a, c);
            String s2=multiply(a, d);
            String s3=multiply(b, c);
            String s4=multiply(b, d);


            long ans;
            ans = Long.parseLong(s1)*(long)Math.pow(10,b.length()+d.length())
            		+Long.parseLong(s3)*(long)Math.pow(10,d.length())
            		+Long.parseLong(s2)*(long)Math.pow(10, b.length())
            		+Long.parseLong(s4);
            return ans+"";
        }
        else

        {
            return (Integer.parseInt(t1)*Integer.parseInt(t2))+"";
        }   
    }
	
	public static int[] converToArray(String n){
		
		int number[] = new int[n.length()];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(n.substring(i,i+1));
		}
		return number;
	}

}
