
public class Prob005
{
	public static int goalFactorial = 20;
	public static long goal = 1;
	
	public static void main(String[] args)
	{
		makeGoal();
		long currentBest = goal;
		
		for(int i = 2; i < goalFactorial+1; i++)
		{
			while(true)
			{
				if(stillWorks(currentBest/i))
					currentBest /= i;
				else
					break;
			}
		}
		
		System.out.println(currentBest);
	}
	
	public static boolean stillWorks(long num)
	{
		boolean works = true;
		for(int i = 2; i < goalFactorial+1; i++)
			if(num % i != 0)
				works = false;
		return works;
	}
		
	public static void makeGoal()
	{
		for(int i = 1; i < goalFactorial+1; i++)
			goal *= i;
	}
}
