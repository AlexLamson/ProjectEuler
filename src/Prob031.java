public class Prob031
{
//                                    0  1  2  3   4   5   6    7
	public static int[] penceTypes = {1, 2, 5, 10, 20, 50, 100, 200};
	public static int penceGoal = 200;
	
	public static int p0 = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0;
	public static long combinations = 0;
	
	public static void main(String[] args)
	{
		for(p7 = (penceGoal-getTotal())/penceTypes[7]; p7 >= 0; p7 --){
			for(p6 = (penceGoal-getTotal())/penceTypes[6]; p6 >= 0; p6 --){
				for(p5 = (penceGoal-getTotal())/penceTypes[5]; p5 >= 0; p5 --){
					for(p4 = (penceGoal-getTotal())/penceTypes[4]; p4 >= 0; p4 --){
						for(p3 = (penceGoal-getTotal())/penceTypes[3]; p3 >= 0; p3 --){
							for(p2 = (penceGoal-getTotal())/penceTypes[2]; p2 >= 0; p2 --){
								for(p1 = (penceGoal-getTotal())/penceTypes[1]; p1 >= 0; p1 --){
									for(p0 = (penceGoal-getTotal())/penceTypes[0]; p0 >= 0; p0 --){
										
//										printTotal();
										
//										try{
//											Thread.sleep(100);
//										} catch (InterruptedException e){}
										
										if(getTotal() == penceGoal)
											combinations++;
										
									}
								}
							}
						}
					}
				}
			}
			
			
		}
		
		System.out.println(combinations+" combinations");
	}
	
	public static int getTotal()
	{
//		printTotal();
		return (p0*penceTypes[0]) + (p1*penceTypes[1]) + (p2*penceTypes[2]) + (p3*penceTypes[3]) + (p4*penceTypes[4]) + (p5*penceTypes[5]) + (p6*penceTypes[6]) + (p7*penceTypes[7]);
	}
	
	public static void printTotal()
	{
		System.out.println(combinations+" "+p0+"x"+penceTypes[0] +" "+ p1+"x"+penceTypes[1] +" "+ p2+"x"+penceTypes[2] +" "+ p3+"x"+penceTypes[3] +" "+ p4+"x"+penceTypes[4] +" "+ p5+"x"+penceTypes[5] +" "+ p6+"x"+penceTypes[6] +" "+ p7+"x"+penceTypes[7]);
	}
}
