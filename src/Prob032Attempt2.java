
public class Prob032Attempt2
{
	public static void main(String[] args)
	{
		long sum = 0;
		for(long a = 1; a < 100000; a++)
		{
			if(a % 10 == 0)
				System.out.println("a: "+a+" sum: "+sum);
			
			if(containsDoubleDigits(a+"") || stringContainsZero(a+""))
			{
//				System.out.println("skipped some zeros in a");
				continue;
			}
			
			for(long b = 100000-a; b > 1; b--)
			{
				System.out.println(a+" * "+b+" = "+(a*b));
				
				String identity = a+""+b+""+(a*b);
				
				if(identity.length() > 10)
				{
//					System.out.println("identity is too long");
					continue;
				}
				else if(identity.length() < 10)
				{
//					System.out.println("identity got too short");
					break;
				}
				else if(stringContainsZero(identity))
				{
//					System.out.println("skipped some zeros in b");
					continue;
				}
				
				if(isPandigital(identity))
					sum += a*b;
			}
		}
		
		System.out.println("answer: "+sum);
	}
	
	public static boolean stringContainsZero(String str)
	{
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == '0')
				return true;
		return false;
	}
	
	public static boolean containsDoubleDigits(String numStr)
	{
		return true;		//placeholder for now
	}
	
	//returns true if num is 1 to n pandigital, n being the length of the number
	public static boolean isPandigital(String numStr)
	{
		int[] arr = getArray(numStr);
		for(int i = 0; i < numStr.length(); i++)
			if((i > 0 && arr[i] != 1) || (i == 0 && arr[0] > 0))
				return false;
		return true;
	}
	
	//get the number of times each digit appears in an integer
	public static int[] getArray(String numStr)
	{
		int[] out = new int[10];
		for(int i = 0; i < numStr.length(); i++)
			out[numStr.charAt(i)-'0']++;
		return out;
	}
}
