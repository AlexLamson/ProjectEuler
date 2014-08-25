import java.math.BigInteger;


public class Prob055
{
	public static void main(String[] args)
	{
//		System.out.println(isLychrel(47));
//		System.out.println(isLychrel(349));
//		System.out.println(isLychrel(196));
//		System.out.println(isLychrel(4994));
		
		int numberOfLychrels = 0;
		for(int i = 1; i < 10000; i++)
			if(isLychrel(i))
				numberOfLychrels++;
		System.out.println("answer: "+numberOfLychrels);
	}
	
	public static String reverse(String str)
	{
		return new StringBuilder(str).reverse().toString();
	}
	
	public static boolean isPalindrome(String str)
	{
		return str.equals(reverse(str));
	}
	
	public static boolean isLychrel(long num)
	{
		int iterations = 0;
		BigInteger sum = new BigInteger(num+"");
		while(iterations < 50)
		{
			sum = sum.add( new BigInteger( reverse(sum+"") ) );
			iterations++;
			if(isPalindrome(sum.toString()))
				return false;
		}
		return true;
	}
}
