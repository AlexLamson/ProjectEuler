import java.util.ArrayList;

//should take about 20 seconds
public class Prob003
{
	public static ArrayList<Long> primes = new ArrayList<Long>();
	public static long goal = 600851475143L;
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		primes.add(2L);
		
		long i = 3L;
		while(i*i < goal)
		{
			if(isPrime(i))
				primes.add(i);
			i+=2;
		}
		
		long answer = 0;
		for(int k = primes.size()-1; k > 0; k--)
		{
			if(goal % primes.get(k) == 0)
			{
				answer = primes.get(k);
				break;
			}
		}
		
		long endTime = System.currentTimeMillis();
		long runTime = endTime - startTime;
		System.out.println(answer+"\nRuntime of "+runTime+" milliseconds");
	}
	
	public static boolean isPrime(long testNum)
	{
		boolean isPrime = true;
		for(int i = 0; i < primes.size(); i++)
		{
			if(testNum % primes.get(i) == 0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
