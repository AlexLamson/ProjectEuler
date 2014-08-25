import java.math.BigInteger;

public class Prob104
{
	public static void main(String[] args)
	{
		BigInteger a = BigInteger.ONE, b = BigInteger.ONE;
		for(int n = 3; n < 10; n++)		//generate the Fibonacci sequence
		{
			BigInteger newNum = a.add(b);
			a = new BigInteger(b.toByteArray());
			b = newNum;
			System.out.println("n = "+n+" fib = "+b);
		}
	}
	
	//return true if is 1-9 pandigital
	public static boolean isPandigital(String numStr)
	{
		if(numStr.length() != 9)
			return false;
		int[] digits = new int[9];
		for(int i = 0; i < 9; i++)
		{
			if(digits[numStr.charAt(i)-'0'] == 1)
				return false;
			digits[numStr.charAt(i)-'0']++;
		}
		
		for(int i = 0; i < 9; i++)
			if(digits[i] == 0)
				return false;
		
		return true;		//placeholder for now
	}
	
	//get the last 9 digits and check if they are pandigital
	public static boolean trailingPandigital(int num)
	{
		return true;		//placeholder for now
	}
	
	//get the first 9 digits and check if they are pandigital
	public static boolean leadingPandigital(int num)
	{
		return true;		//placeholder for now
	}
}
