import java.util.Arrays;

/*
 * Time for the cheater method!
 * increment by 1 every time, and test whether each number uses every digit once,
 * then increment some other variable
 * when the second variable reaches 1000000, then yer done!
 */


public class Prob024Attempt2
{
	public static int[] combo = {0,9,8,7,6,5,4,3,2,1};//{0,1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args)
	{
		int combos = 0;
		while(combos <= 1000000)
		{
			System.out.println(Arrays.toString(combo)+"\tcombos: "+combos);
			combo = increment(combo);
			if(works(combo))
				combos++;
		}
		
		System.out.println(Arrays.toString(combo));
	}
	
	//treat the array like a number and increment it
	public static int[] increment(int[] combo)
	{
		long testLong = arrayToLong(combo)+1;
		String longString = ""+testLong;
		int[] out = new int[combo.length];
		int start = 0;
		if(testLong <= 987654321)
		{
			out[0] = 0;
			start = 1;
			longString = "0"+longString;
		}
		
		for(int i = start; i < out.length; i++)
			out[i] = Integer.parseInt(""+longString.charAt(i));
		return out;
	}
	
	//return true if the number uses one of every digit
	public static boolean works(int[] combo)
	{
		int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
		for(int i = 0; i < combo.length; i++)
		{
			switch(combo[i])
			{
			case 0:
				zero++;
				break;
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			case 7:
				seven++;
				break;
			case 8:
				eight++;
				break;
			case 9:
				nine++;
				break;
			}
		}
		
		if(zero == 1 && one == 1 && two == 1 && three == 1 && four == 1 && five == 1 && six == 1 && seven == 1 && eight == 1 && nine == 1)
			return true;
		return false;
	}
	
	//convert array of ints into a long		{1,2,3,4}	->	1234L
	public static long arrayToLong(int[] combo)
	{
		long output = 0;
		int multiplier = 1;
		for(int i = combo.length-1; i >= 0; i--)
		{
			output += combo[i] * multiplier;
			multiplier *= 10;
		}
		return output;
	}
}
