import java.util.ArrayList;

/*

By replacing the 1st digit of the 2-digit number *3, it turns out that six of the nine possible values: 13, 23, 43, 53, 73, and 83, are all prime.

By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit number is the first example having seven primes among the ten generated numbers, yielding the family: 56003, 56113, 56333, 56443, 56663, 56773, and 56993. Consequently 56003, being the first member of this family, is the smallest prime with this property.

Find the smallest prime which, by replacing part of the number (not necessarily adjacent digits) with the same digit, is part of an eight prime value family.

 */

public class Prob051
{
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	public static final int primesNeeded = 8;
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++)	//1000000
			isPrime(i);
		
		/*
		 * here you must generate the wildcard arrays for each number
		 */
	}
	
	public static boolean hasEight(int[] numArr, boolean[] wildcards)
	{
		int primesFound = 0;
		
		int[] testArr = new int[numArr.length];	//this will be a copy of the input num array
		for(int i = 0; i < 10; i++)	//for each member of the family of values
		{
			for(int j = 0; j < numArr.length; j++)	//reset the testing array again
				testArr[j] = numArr[j];
			
			for(int j = 0; j < testArr.length; j++)	//replace parts of number via wildcards array
				if(wildcards[j])
					testArr[j] = i;
			
			if(isPrime(arrayToNum(testArr)))
				primesFound++;
			
			if( (testArr.length-i) + primesFound < primesNeeded)
				return false;
		}
		
		return true;
	}
	
	public static int[] numToArray(int num)
	{
		String numStr = num+"";
		int[] arr = new int[numStr.length()];
		for(int i = 0; i < arr.length; i++)
			arr[i] = numStr.charAt(i)-'0';
		return arr;
	}
	
	public static long arrayToNum(int[] arr)
	{
		long num = 0;
		for(int i = 0; i < arr.length; i++)
			num += arr[i] * powerOfTen(arr.length-i);
		return num;
	}
	
	public static long powerOfTen(int power)
	{
		long result = 1;
		for(int i = 0; i < power; i++)
			result *= 10;
		return result;
	}
	
	public static boolean isPrime(long num)
	{
		for(int i = 0; i < primes.size(); i++)
			if(num % primes.get(i).intValue() == 0 && num != primes.get(i).intValue())
				return false;
		return true;
	}
}
