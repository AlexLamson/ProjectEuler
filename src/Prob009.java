
public class Prob009
{
	public static int goal = 1000;
	
	public static void main(String[] args)
	{
		int aDub = 1, bDub = 1, cDub = 1;
		int aSave = 1, bSave = 1, cSave = 1;
		boolean breakEverything = false;
		for(int a = 1; a < goal; a++)
		{
			aDub = a*a;
			for(int b = a+1; b < goal; b++)
			{
				bDub = b*b;
				for(int c = b+1; c < goal; c++)
				{
					cDub = c*c;
					if(aDub + bDub == cDub && a + b + c == goal)
					{
						aSave = a;
						bSave = b;
						cSave = c;
						breakEverything = true;
					}
					
					if(breakEverything)
						break;
				}
				
				if(breakEverything)
					break;
			}
			
			if(breakEverything)
				break;
		}
		
		int product = aSave * bSave * cSave;
		System.out.println("a: "+aSave+", b: "+bSave+", c: "+cSave);
		System.out.println("answer: "+product);
	}
}
