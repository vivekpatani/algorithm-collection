package careercup.google;

import java.util.Scanner;

public class FindStringsOfN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(count(new String(),n));

	}

	public static int count(String str, int count)
	{
		int sum = 0;
		if (count <= 0)
		{
			System.out.println(str);
			return 1;
		}
		if (str.indexOf('b') == -1)
		{
			sum = sum + count(str + "a", count - 1);
			sum = sum + count(str + "b", count - 1);
			if (str.length() > 0 && str.charAt(str.length() - 1) != 'c')
			{
				sum = sum + count(str + "c", count - 1);
			} else if (str.length() == 0)
			{
				sum = sum + count(str + "c", count - 1);
			}
		} else
		{
			sum = sum + count(str + "a", count - 1);
			if (str.length() > 0 && str.charAt(str.length() - 1) != 'c')
			{
				sum = sum + count(str + "c", count - 1);
			} else if (str.length() == 0)
			{
				sum = sum + count(str + "c", count - 1);
			}
		}
		return sum;
	}

}
