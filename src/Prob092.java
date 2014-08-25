
//should finish in 5 minutes or less
public class Prob092
{
	public static void main(String[] args)
	{
		long numEightyNines = 0;
		for(long i = 2; i < 10000000; i++)
		{
			if(i % 1000 == 0)
				System.out.println("testing "+i);
			long j = i;
			while(j != 89 && j != 1)
				j = getSumOfDigits(j);
			if(j == 89)
				numEightyNines++;
		}
		System.out.println(numEightyNines);
	}
	
	public static long getSumOfDigits(long num)
	{
		long sum = 0;
		String strNum = num+"";
		for(int i = 0; i < strNum.length(); i++)
		{
			int parsedInt = Integer.parseInt(strNum.charAt(i)+"");
			sum += parsedInt*parsedInt;
		}
		return sum;
	}
}
