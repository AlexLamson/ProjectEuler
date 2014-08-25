
public class Prob045
{
	public static long tn = 286, pn = 165, hn = 143;
	public static long answer = 0;
	public static long hex = getHex(hn), pent = getPent(pn), tri = getTri(tn);
	
	public static void main(String[] args)
	{
		while(answer == 0)
		{
//			System.out.println("tri: "+tri+" pent: "+pent+" hex: "+hex);
//			System.out.println("tn: "+tn+" pn: "+pn+" hn: "+hn);
			
			increaseTri();
			increasePent();
			increaseHex();
			
			if(tri == pent && pent == hex)
				answer = tri;
		}
		System.out.println("answer: "+answer);
	}
	
	public static void increaseTri()
	{
		while(tri < pent || tri < hex)
		{
			tn++;
			tri = getTri(tn);
		}
	}
	
	public static void increasePent()
	{
		while(pent < tri || pent < hex)
		{
			pn++;
			pent = getPent(pn);
		}
	}
	
	public static void increaseHex()
	{
		while(hex < tri || hex < pent)
		{
			hn++;
			hex = getHex(hn);
		}
	}
	
	public static long getTri(long n)
	{
		return n*(n+1)/2;
	}
	
	public static long getPent(long n)
	{
		return n*(3*n-1)/2;
	}
	
	public static long getHex(long n)
	{
		return n*(2*n-1);
	}
}
