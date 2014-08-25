public class Prob015
{
	public static int size = 20		*2+1;	//the bit on the end is because it need to check every other diagonal
	public static long[][] triangle = new long[size][size];
	
	public static void main(String[] args)
	{
		triangle[0][0] = 1;
		for(int row = 1; row < triangle.length; row++)
		{
			for(int col = 0; col < row+1; col++)
			{
				if(col == 0 || col == row)
					triangle[row][col] = 1;
				else if(col > row)
					triangle[row][col] = 0;
				else
					triangle[row][col] = triangle[row-1][col] + triangle[row-1][col-1];
			}
		}
		
		printTriangle();
		
		long answer = triangle[size-1][(triangle[size-1].length-1)/2];
		System.out.println(answer);
	}
	
	public static void printTriangle()
	{
		for(int row = 0; row < triangle.length; row++)
		{
			System.out.print(row+"\t");
			for(int col = 0; col < triangle[0].length; col++)
			{
				if(triangle[row][col] != 0)
					System.out.print(triangle[row][col]+" ");
			}
			System.out.println();
		}
	}
}