
public class Prob012
{
	
	
	public static void main(String[] args)
	{
		long triangleNum = 0, answer = 0;
		for(int i = 1; true; i++)
		{
			triangleNum += i;
			if(getDivisors(triangleNum) > 500)
				{
					answer = triangleNum;
					break;
				}
		}
		
		System.out.println(answer);
	}
	
	public static int getDivisors(long triangleNum)
	{
		int divisors = 0;
		
		for(long i = 1; i*i < triangleNum; i++)
		{
		if(triangleNum % i == 0)
			divisors++;
		}
		
		divisors *= 2;
		return divisors;
	}
}
