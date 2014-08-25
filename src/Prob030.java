public class Prob030
{
	public static int power = 5;
	
	public static void main(String[] args)
	{	
		//	System.out.println("9^4: "+expo(9,4));
		//	System.out.println("powerSum(9999): "+getPowerSum(9999));
		
		String sumString = "";
		long sum = 0;
		for(int i = 2; i < 200000; i++)
		{
			if(i == getPowerSum(i))
			{
				sum += i;
				sumString += " "+i;
				System.out.print(i+" ");
			}
		}
		
		System.out.println(sumString);
		System.out.println("(answer) sum: "+sum);
	}
	
	public static int getPowerSum(int num)
	{
		String numString = num+"";
		int sum = 0;
		for(int i = 0; i < numString.length(); i++)
			sum += (int)expo(Integer.parseInt(numString.charAt(i)+""), power);
		return sum;
	}
	
	public static long expo(int base, int power)
	{
		long baseSave = base;
		for(int i = 1; i < power; i++)
			baseSave *= base;
		return baseSave;
	}
}