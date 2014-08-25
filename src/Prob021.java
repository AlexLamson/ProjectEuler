import java.util.ArrayList;

public class Prob021
{
	public static ArrayList<Integer> skipThese = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		//find possible amicable numbers
		int sumOfAllAmicable = 0;
		for(int i = 1; i < 10000; i++)
		{
			if(!shouldSkip(i))
			{
				int k = sumOfDivisors(i);
				if(k != i && sumOfDivisors(k) == i)
				{
					skipThese.add(i);
					skipThese.add(k);
					sumOfAllAmicable += i + k;
				}
			}	
		}
		
		System.out.println(sumOfAllAmicable);
	}
	
	public static boolean shouldSkip(int num)
	{
		for(int i = 0; i < skipThese.size(); i++)
			if(skipThese.get(i) == num)
				return true;
		return false;
	}
	
	public static int sumOfDivisors(int num)
	{
		int sum = 0;
		for(int k = 1; k < num; k++)
			if(num % k == 0)	//if it is a proper divisor
				sum += k;		//add it to the sum
		return sum;
	}
}
