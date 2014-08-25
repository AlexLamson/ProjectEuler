
public class Prob063
{
	public static void main(String[] args)
	{
		int numsFound = 0;
		for(int pow = 1; true; pow++)
		{
			long num = 1;
			boolean foundANum = false;
			for(int base = 1; num <= pow; base++)
			{
				num = power(base, pow);
				if((""+num).length() == pow)
				{
					numsFound++;
					foundANum = true;
				}
			}
			if(!foundANum)
				break;
		}
		System.out.println(numsFound+" nums found");
	}
	
	public static long power(int base, int pow)
	{
		long num = 1;
		for(int i = 0; i < pow; )
			num *= base;
		return num;
	}
}
