import java.math.BigInteger;

//Generate the fibonacci sequence until n contains 1000 digits
public class Prob025
{
	public static void main(String[] args)
	{
		BigInteger val1 = BigInteger.ONE;
		BigInteger val2 = BigInteger.ONE;
		long term = 2;
		while(val2.toString().length() < 1000)
		{
			BigInteger valSave = val2;
			val2 = val2.add(val1);
			val1 = valSave;
			term++;
		}
		System.out.println("term: "+term);
		
//		int val1 = 1, val2 = 1;
//		while(val2 < 150)
//		{
//			System.out.println(val2);
//			int valSave = val2;
//			val2 += val1;
//			val1 = valSave;
//		}
	}
}
