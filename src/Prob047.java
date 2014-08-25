import java.util.ArrayList;

public class Prob047
{
	public static ArrayList<Long> primes = new ArrayList<Long>();
	
	public static final int consecutiveNumbers = 2;
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		//find all the primes under 100
		primes.add(2L);
		long k = 3L;
		while(k < 100)
		{
			if(isPrime(k))
				primes.add(k);
			k+=2;
		}
		
		
		long answer = 0;	//will hold the answer
		
		//here, check all the consecutive numbers
		for(long i = 3; i < 100; i++)
		{
			for(long j = i; j < i+consecutiveNumbers; j++)
			{
				//if for every j hasDistinct == true, then the answer = j
				
			}
		}
		
		
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		System.out.println(answer+"\nRuntime of "+runTime+" milliseconds");
	}
	
	public static boolean isPrime(long testNum)
	{
		for(int i = 0; i < primes.size(); i++)
			if(testNum % primes.get(i) == 0)
				return false;
		return true;
	}
	
	public static ArrayList<Long> getFactors(long num)
	{
		ArrayList<Long> out = new ArrayList<Long>();
		
		if(isPrime(num))
		{
			out.add(num);
			return out;
		}
		
		for(int i = primes.size()-1; i > 0; i--)
			if(num % primes.get(i) == 0)
				out.add(primes.get(i));
		
		return out;
	}
	
//"has distinct primes factors" means that means that 3 factors are different, and all the others (if there are others) are duplicates of the previous factors
	public static boolean hasDistinct(long num, int factors)
	{
		return false;	//placeholder
	}
}
