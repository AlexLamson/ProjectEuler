//import java.util.Arrays;
//
//public class Prob24
//{
//	public static int[] combo = {0,1,2};
//	
//	public static void main(String[] args)
//	{
//		//get the number of possible combinations, for fun
//		System.out.println("Possible combinations: "+combosFor(10));
//		
//		for(long i = 1; i <= 1000000; i++)
//			num = increment(num);
//	}
//	
//	public static int[] increment(long num)
//	{
//		return nextNum(findBrake(num),num);
//	}
//	
//	public static int findBrake(long num)
//	{
//		for(int i = combo.length - 1; i >= 0; i--)
//			if(nextNum(i, num) > num)
//				return i;
//		return 0;
//	}
//	
//	public static int[] nextNum(int brake, int[] combo)
//	{
//		//find smallest number to right of brake that is greater than brake
//		int smallest = 10, smallPos = -1;
//		for(int i = brake+1; i < combo.length; i++)
//			if(combo[i] > combo[brake] && combo[i] < smallest)
//			{
//				smallPos = i;
//				smallest = combo[i];
//			}
//		
//		//switch the positions of the number we just found with the break number
//		combo = switchPlaces(brake, smallPos, combo);
//		
//		//sort numbers to the right of the brake in ascending order
//		int[] sortedEnd = new int[combo.length -1 - brake];
//		int k = 0;
//		for(int i = brake + 1; i < combo.length; i++)
//		{
//			sortedEnd[k] = combo[i];
//			k++;
//		}
//		Arrays.sort(sortedEnd);
//		
//		//write the sorted array to the end of the combo array
//		
//	}
//	
//	public static int[] switchPlaces(int i, int j, int[] combo)
//	{
//		int save = combo[j];
//		combo[i] = combo[j];
//		combo[j] = save;
//		return combo;
//	}
//	
//	public static int combosFor(int length)
//	{
//		System.out.println("in: "+1+"\tout: "+1);
//		int out = 1;
//		for(int in = 2; in <= length; in++)
//		{
//			out = in * out;
//			System.out.println("in: "+in+"\tout: "+out);
//		}
//		return out;
//	}
//}
