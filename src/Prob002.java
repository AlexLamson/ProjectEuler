public class Prob002
{
	public static void main(String[] args)
	{
		int prev1 = 1, prev2 = 2, sum = 0;
		while(prev2 <= 4000000)
		{
			System.out.println("prev1: "+prev1+"\tprev2: "+prev2);
			if(prev2 % 2 == 0)
				sum += prev2;
			int prev2Save = prev2;
			prev2 = prev2 + prev1;
			prev1 = prev2Save;
		}
		System.out.println(sum);
	}
}
