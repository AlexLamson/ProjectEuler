
public class Prob028
{
	public static int width = 1001;
	
	public static void main(String[] args)
	{
		int num = 1, toAdd = 2, sum = 0;
		while(num < width*width)
		{
			for(int i = 0; i < 4; i++)
			{
//				System.out.println("num: "+num);
				sum += num;
				num += toAdd;
			}
			toAdd += 2;
		}
//		System.out.println("num: "+num);
		sum += num;
		
		System.out.println(sum);
	}
}