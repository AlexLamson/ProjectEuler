
public class Prob014
{
	public static void main(String[] args)
	{
		int bestChain = 10, bestNum = 13;
		for(int i = 1000000-1; i > 1; i--)
		{
			System.out.println("i: "+i+"\tcurrent best num: "+bestNum+"\tcurrent best chain: "+bestChain);
			
			int currentChain = getTerms(i);
			if(currentChain > bestChain)
			{
				bestChain = currentChain;
				bestNum = i;
			}
		}
		
		System.out.println("best num: "+bestNum+"\tbest chain: "+bestChain);
	}
	
	public static int getTerms(long num)
	{
		int terms = 1;
		while(num != 1)
		{
			//System.out.println("\t\t\t\t\t\t\t\t\t"+num);
			if(num % 2 == 0)		//if number is even
				num /= 2;
			else					//if number is odd
				num = 3*num + 1;
			terms++;
		}
		return terms;
	}
}
