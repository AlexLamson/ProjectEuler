
public class Prob006
{
	public static int goal = 100;
	
	public static void main(String[] args)
	{
		long sumOfSquares = 0, sum = 0;
		
		for(int i = 1; i < goal+1; i++)
		{
			sumOfSquares += i*i;
			sum += i;
		}
		
		long squareOfSum = sum*sum;
		long answer = squareOfSum - sumOfSquares;
		
//		System.out.println("sum: "+sum+"\tsumOfSquares: "+sumOfSquares+"\tsquareOfSum: "+squareOfSum);
		System.out.println(answer);
	}
}
