//How many ways can you make $5 with American money? (50 cent coins and $2 bills included)

public class Prob031Fun
{
	public static int penceGoal = 500;		//goal total amount of pence
//                                    0  1  2  3   4   5   6    7
	public static int[] penceTypes = {1, 5, 10, 25, 50, 100, 200, 500};	//value for each coin
	public static int[] quantity = new int[penceTypes.length];		//the number of each kind of coin
	public static long combinations = 0;	//number of combinations found that make 200 pence
	
	public static void main(String[] args)
	{
		getCombosFor(7);
		
		System.out.println(combinations+" combinations");
	}
	
	public static void getCombosFor(int pos)
	{
		for(quantity[pos] = (penceGoal-getTotal())/penceTypes[pos]; quantity[pos] >= 0; quantity[pos]--)
		{
			if(pos > 0)
				getCombosFor(pos-1);
			else	//we are in the innermost loop
			{
				if(getTotal() == penceGoal)
					combinations++;
			}
		}
	}
	
	public static int getTotal()
	{
//		printTotal();
		int total = 0;
		for(int i = 0; i < penceTypes.length; i++)
			total += quantity[i]*penceTypes[i];
		return total;
	}
	
	public static void printTotal()
	{
		String outStr = combinations+"";
		for(int i = 0; i < penceTypes.length; i++)
			outStr += " "+quantity[i]+"x"+penceTypes[i];
		System.out.println(outStr);
	}
}
