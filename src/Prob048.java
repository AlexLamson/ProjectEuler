import java.math.BigInteger;

/*
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */
public class Prob048
{
	public static int goal = 1000;
	public static BigInteger total = BigInteger.ZERO;
	
	public static void main(String[] args)
	{
		for(int i = 1; i <= goal; i++)
		{
			total = total.add(new BigInteger(""+i).pow(i));
//			total += Math.pow(i, i);
		}
		System.out.println(total.toString());
	}
}
