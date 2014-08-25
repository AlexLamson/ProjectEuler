import java.math.BigInteger;

public class Prob020
{
	public static void main(String[] args)
	{
		BigInteger factorial = BigInteger.ONE;
		for(int i = 100; i > 0; i--)
			factorial = factorial.multiply(new BigInteger(""+i));
		String bigString = factorial.toString();
		
		int sum = 0;
		for(int i = 0; i < bigString.length(); i++)
			sum += Integer.parseInt(String.valueOf(bigString.charAt(i)));
		
		System.out.println(sum);
	}
}
