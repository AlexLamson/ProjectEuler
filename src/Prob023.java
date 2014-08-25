import java.util.ArrayList;

public class Prob023
{
	public static ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
//		System.out.println("is 12 abundant? "+isAbundant(12));	//should be true
//		System.out.println("is 28 abundant? "+isAbundant(28));	//should be false
		
		//find all the abundant numbers <= 28123
		for(int i = 1; i < 28123; i++)
		{
			System.out.println("Testing if "+i+" is abundant...");
			if(isAbundant(i))
				abundantNumbers.add(i);
		}
		
//		printArray();
		
//		for(int i = 12; i < 20; i++)
//			System.out.println("is "+i+" a non-abundant sum? "+isNonAbundantSum(i));
		
//		System.out.println("Array size is "+abundantNumbers.size());
//		System.out.println(4181101-4179871);

//		test for numbers that can't be expressed as the sum of 2 abundant numbers
		int sumOfNonAbundantSums = 0;
		for(int i = 12; i <= 28123; i++)
		{
			System.out.println("Testing if "+i+" is a non-abundant sum...");
			if(isNonAbundantSum(i))
				sumOfNonAbundantSums += i;
		}
		System.out.println(sumOfNonAbundantSums+" should be\n4179871");
	}
	
	public static boolean isNonAbundantSum(int num)
	{
		if(num  < 12)
			return false;
		for(int i = 12; i < abundantNumbers.size() && abundantNumbers.get(i) <= num; i++)
			if(isAbundant(num - abundantNumbers.get(i)))
				return false;
		return true;
	}
	
	public static boolean isAbundant(int num)
	{
		int sum = sumOfDivisors(num);
		if(sum > num)
			return true;
			
		return false;
	}
	
	public static int sumOfDivisors(int num)
	{
		int sum = 0;
		for(int k = 1; k < num; k++)
			if(num % k == 0)	//if it is a proper divisor
				sum += k;		//add it to the sum
		return sum;
	}
	
	public static void printArray()
	{
		for(int i = 0; i < abundantNumbers.size(); i++)
			System.out.println(i);
	}
}
