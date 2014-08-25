import java.util.ArrayList;

public class Prob044
{
	public static ArrayList<Integer> pents = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		int bestD = 10000000;
		
		for(int n = 1; n < 100; n++)
		{
			pents.add( new Integer(getPent( getPent(n) )) );
			
			for(int j = 0; j < pents.size(); j++)
			{
				int k = n-1;
				
				int sum = pents.get(k) + pents.get(j);
				int diff = pents.get(k) - pents.get(j);
				int D = Math.abs(diff);
				
				if( isPent(sum) && isPent(diff) && D < bestD )
				{
					bestD = D;
				}
				
			}
		}
		
		System.out.println("best D: "+bestD);
	}
	
	public static boolean isPent(int num)
	{
		return pents.contains( new Integer(num) );
	}
	
	public static int getPent(int n)
	{
		return n*(3*n-1)/2;
	}
}
