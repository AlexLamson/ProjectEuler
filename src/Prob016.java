import java.math.BigInteger;

public class Prob016
{
	public static void main(String[] args)
	{
		BigInteger two = new BigInteger("2");
		
		int exponent = 1000;
		BigInteger bigTwo = new BigInteger("1");
		for(int i = 0; i < exponent; i++)
			bigTwo = bigTwo.multiply(two);
		
		String bigString = bigTwo.toString();
		
		int sum = 0;
		for(int i = 0; i < bigString.length(); i++)
			sum += Integer.parseInt(String.valueOf(bigString.charAt(i)));
		
		System.out.println(sum);
	}
}
