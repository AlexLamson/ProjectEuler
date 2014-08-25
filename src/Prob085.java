
public class Prob085
{
	public static final int goal = 2000000;
	
	public static void main(String[] args)
	{
		int bestDistance = Integer.MAX_VALUE;
		int bestXSize = 0, bestYSize = 0;
		for(int x = 1; x <= 100; x++)
		{
//			if(x % 10 == 0)
//				System.out.println("checking x: "+x+" current best distance: "+bestDistance+" with size "+bestXSize+" x "+bestYSize);
			
			for(int y = 1; y <= 100; y++)
			{
				int distance = getDistance(getCombosForRect(x, y));
				if(distance < bestDistance)
				{
					bestDistance = distance;
					bestXSize = x;
					bestYSize = y;
				}
			}
		}
		System.out.println(bestXSize+" x "+bestYSize+" with distance "+bestDistance);
		System.out.println("answer: "+(bestXSize*bestYSize));
	}
	
	public static int getDistance(int num)
	{
		return Math.abs(goal - num);
	}
	
	public static int getCombosForRect(int width, int height)
	{
		int combos = 0;
		for(int ySize = 1; ySize <= height; ySize++)
			for(int xSize = 1; xSize <= width; xSize++)
				combos += getCombosForSize(xSize, ySize, width, height);
		return combos;
	}
	
	public static int getCombosForSize(int xSize, int ySize, int width, int height)
	{
		return (width-xSize+1)*(height-ySize+1);
	}
}
