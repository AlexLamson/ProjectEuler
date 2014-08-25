//import java.util.ArrayList;
//
///*
//
//By replacing the 1st digit of the 2-digit number *3, it turns out that six of the nine possible values: 13, 23, 43, 53, 73, and 83, are all prime.
//
//By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit number is the first example having seven primes among the ten generated numbers, yielding the family: 56003, 56113, 56333, 56443, 56663, 56773, and 56993. Consequently 56003, being the first member of this family, is the smallest prime with this property.
//
//Find the smallest prime which, by replacing part of the number (not necessarily adjacent digits) with the same digit, is part of an eight prime value family.
//
// */
//
//public class Prob051Attempt2
//{
//	public static ArrayList<Integer> primes = new ArrayList<Integer>();
//	public static final int primesNeeded = 6;
//	
//	public static void main(String[] args)
//	{
//		boolean[] answerWildcards = new boolean[1];		//value is a placeholder
//		int answerPrime = 0;							//value is a placeholder
//		
//		boolean breakAll = false;
//		makePrimesBetween(1, 10);
//		for(int order = 1; !breakAll && order < 5; order++)	// "order < 2" means up to 100
//		{
//			int primeSizeSave = primes.size();		//size of the primes arraylist before adding the new primes
//			makePrimesBetween(power(10, order), power(10, order+1));
//			
//			for(int j = primeSizeSave; j < primes.size(); j++)	//for all of the primes of the new length
//			{
//				System.out.println("checking "+primes.get(j).intValue());
//				boolean[] wildcards = new boolean[order+1];
//				
//				for(int i = 0; i < power(2, order)-1; i++)	//for each possible wildcard combination (check that this works for 4 digit numbers)
//				{
//					increment(wildcards);
//					
////					System.out.println("checking "+primes.get(j).intValue()+" with wildcards: "+arrayToString(wildcards));
//					
//					if(testArray(primes.get(j).intValue(), wildcards))
//					{
//						answerPrime = primes.get(j).intValue();
//						answerWildcards = wildcards;
//						breakAll = true;
//						break;
//					}
//				}
//				
//				if(breakAll)
//					break;
//			}
//			
//			if(breakAll)
//				break;
//		}
//		
//		if(breakAll)
//			System.out.println("breakAll is true");
//		System.out.println("answer: "+findSmallestPrime(answerPrime, answerWildcards));
//	}
//	
//	public static int findSmallestPrime(int answerPrime, boolean[] answerWildcards)
//	{
//		int[] numArr = numToArray(answerPrime);
//		for(int replacement = 0; replacement <= 9; replacement++)
//		{
//			for(int j = 0; j < numArr.length; j++)
//				if(answerWildcards[j] && !(j == 0 && replacement == 0))
//					numArr[j] = replacement;
//			if(isPrime(arrayToNum(numArr)))
//			{
//				System.out.println(arrayToString(answerWildcards));
//				
//				return arrayToNum(numArr);
//			}
//		}
//		return 0;
//	}
//	
//	public static boolean testArray(int startingPrime, boolean[] wildcards)
//	{
//		if(wildcards.length == 1)
//			return false;
//		
//		int[] numArr = numToArray(startingPrime);
//		int primesFound = 0;
//		
//		//if this prime doesn't have the same digits for the places being checked, decrease the number of primes found
//		int firstPos = 0;
//		for(int i = 0; i < wildcards.length; i++)
//			if(wildcards[i])
//				firstPos = i;
//		boolean sameDigits = true;
//		for(int i = 0; i < numArr.length; i++)
//		{
//			if(wildcards[i] && numArr[i] != numArr[firstPos])
//			{
////				sameDigits = false;
////				break;
//				return false;
//			}
//		}
////		if(sameDigits)
////			primesFound++;
//		
//		for(int replacement = 0; replacement <= 9; replacement++)	//for each member of the family of values
//		{
//			//replace parts of number via wildcards array
//			for(int i = 0; i < numArr.length; i++)
//				if(wildcards[i] && !(i == 0 && replacement == 0))
//					numArr[i] = replacement;
//			
//			int num = arrayToNum(numArr);
//			if(num != startingPrime && isPrime(num))
//				primesFound++;
//			
////			if( (testArr.length-i) + primesFound < primesNeeded)			//uncomment & test this after it works
////				return false;
//		}
////		primesFound++;
//		
////		System.out.println(startingPrime+" has a "+primesFound+" combinations");
//		
//		if(primesFound < primesNeeded)
//			return false;
//		
//		System.out.println("oi! it works!");
//		
//		return true;
//	}
//	
//	public static int[] numToArray(int num)
//	{
//		String numStr = num+"";
//		int[] arr = new int[numStr.length()];
//		for(int i = 0; i < arr.length; i++)
//			arr[i] = numStr.charAt(i)-'0';
//		return arr;
//	}
//	
//	public static int arrayToNum(int[] arr)
//	{
//		int num = 0;
//		for(int i = 0; i < arr.length; i++)
//			num += arr[i] * power(10, arr.length-i-1);
//		return num;
//	}
//	
//	public static int power(int base, int pow)
//	{
//		int result = 1;
//		for(int i = 0; i < pow; i++)
//			result *= base;
//		return result;
//	}
//	
//	public static void makePrimesBetween(int startNum, int endNum)
//	{
//		System.out.println("generating primes between "+startNum+" and "+endNum);
//		for(int i = startNum; i < endNum; i++)
//			isPrime(i);
//	}
//	
//	public static boolean isPrime(int num)
//	{
//		if(num == 1)
//			return false;
//		if(primes.contains(new Integer(num)))
//			return true;
//		for(int i = 0; i < primes.size(); i++)
//			if(num % primes.get(i).intValue() == 0)
//				return false;
//		primes.add(new Integer(num));
//		return true;
//	}
//	
//	public static boolean[] increment(boolean[] arr)
//	{
//		for(int i = arr.length-2; i >= 0; i--)
//		{
//			if(!arr[i])
//			{
//				arr[i] = true;
//				for(int j = i+1; j < arr.length-1; j++)
//					arr[j] = false;
//				break;
//			}
//		}
//		return arr;
//	}
//	
//	public static String arrayToString(int[] arr)
//	{
//		String str = "";
//		for(int i = 0; i < arr.length; i++)
//			str += arr[i]+" ";
//		return str;
//	}
//	
//	public static String arrayToString(boolean[] arr)
//	{
//		String str = "";
//		for(int i = 0; i < arr.length; i++)
//		{
//			if(arr[i])
//				str += "1 ";
//			else
//				str += "0 ";
//		}
//		return str;
//	}
//}
