
public class Prob034
{
	
	public static void main(String[] args)
	{
//		System.out.println("5! = "+factorial(5));
//		System.out.println("facSum(145) = "+facSum(145));
		
		String sumString = "";
		long sum = 0;
		for(int i = 3; i < 50000; i++)
		{
			if(i == facSum(i))
			{
				sum += i;
				sumString += " "+i;
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n(answer) sum: "+sum);
	}
	
	public static int facSum(int num)
	{
		String numString = num+"";
		int sum = 0;
		for(int i = 0; i < numString.length(); i++)
			sum += factorial(Integer.parseInt(numString.charAt(i)+""));
		
		return sum;
	}
	
	public static long factorial(int num)
	{
		long total = 1;
		
		for(int i = num; i > 1; i--)
			total *= i;
		
		return total;
	}
}
