import java.util.ArrayList;

public class Prob049
{
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		//seed prime arraylist
		primes.add(new Integer(2));
		
		//generate all 4 digit primes
		for(int i = 3; i < 10000; i++)
			if(isPrime(i))
				primes.add(new Integer(i));
		
		//get position of first 4 digit prime in list of primes
		int posOfLowest4DigitPrime = 0;
		for(int i = 0; i < primes.size(); i++)
		{
			if(primes.get(i).intValue() > 999)
			{
				posOfLowest4DigitPrime = i;
				break;
			}
		}
		
		int startingPrime = 0;
		int increaseAmount = 0;
		boolean breakAll = false;
		
		for(int i = posOfLowest4DigitPrime; i < primes.size(); i++)		//i = position of prime
		{
			int max = ( primes.get(primes.size()-1) - primes.get(i) ) / 2;
			for(int j = 2; j < max; j+=2)	//j = number added to prime
			{
				int firstNum = primes.get(i) + j;
				int secondNum = primes.get(i) + j + j;
				
				if(primes.get(i).intValue() == 1487)
					continue;
				
				if(isPrime(firstNum) && isPrime(secondNum) &&
						numbersArePermutations(primes.get(i), firstNum) && 
						numbersArePermutations(firstNum, secondNum))
				{
					startingPrime = primes.get(i);
					increaseAmount = j;
					
					breakAll = true;
					break;
				}
			}
			
			if(breakAll)
				break;
		}
		
		System.out.println("answer: "+(startingPrime)+""+(startingPrime+increaseAmount)+
				""+(startingPrime+increaseAmount+increaseAmount));
	}
	
	
	public static boolean isPrime(int num)
	{
		for(int i = 0; i < primes.size(); i++)	//assume arraylist has already been seeded with a 2
			if(num % primes.get(i) == 0 && num != primes.get(i))
				return false;
		return true;
	}
	
	//return true if number contains the same digits, regardless of order
	public static boolean numbersArePermutations(int num1, int num2)
	{
		return arraysAreSame(getArray(num1), getArray(num2));
	}
	
	//get the number of times each digit appears in an integer
	public static int[] getArray(int num)
	{
		String numStr = num+"";
		int[] out = new int[10];
		for(int i = 0; i < numStr.length(); i++)
			out[numStr.charAt(i)-'0']++;
		return out;
	}
	
	//return true if both arrays have the same numbers in the same order
	public static boolean arraysAreSame(int[] arr1, int[] arr2)
	{
		if(arr1.length != arr2.length)
			return false;
		
		for(int i = 0; i < arr1.length; i++)
			if(arr1[i] != arr2[i])
				return false;
		
		return true;
	}
}
