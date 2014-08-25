
public class Prob004
{
	
	
	public static void main(String[] args)
	{
		int bestPal = 0;
		for(int i = 100; i < 1000; i++)
		{
			for(int k = 100; k < 1000; k++)
			{
				if(isPal(i*k) && i*k > bestPal)
					bestPal = i*k;
			}
		}
		
		System.out.println(bestPal);
	}
	
	public static boolean isPal(int num)
	{
		String numString = num+"";
		String revString = new StringBuffer(numString).reverse().toString();
		if(numString.equals(revString))
			return true;
		return false;
	}
}
