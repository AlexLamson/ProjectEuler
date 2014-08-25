//import java.math.BigInteger;
//
////should take ~20 minutes
//public class Prob066
//{
//	public static void main(String[] args)
//	{
//		BigInteger bestX = BigInteger.ZERO;
//		for(BigInteger D = BigInteger.ONE; D.compareTo(new BigInteger("1001")) == -1; D.add(BigInteger.ONE))
//		{
//			if(D.mod(BigInteger.TEN).equals(BigInteger.ZERO))
//				System.out.println((100f*D.intValue()/1000f)+"% ==============");
//			
//			if(!isSquare(D))
//			{
//				BigInteger x = BigInteger.ONE;
//				BigInteger y = BigInteger.ONE;
//				boolean breakBoth = false;
//				for(; true; x.add(BigInteger.ONE))
//				{
//					for(y = BigInteger.ONE; true; y.add(BigInteger.ONE))
//					{
//						long dio = getDiophantine(x, y, D);
//						
//						if(dio < 1)
//							break;
//						if(dio > 1)
//							continue;
//						
//						System.out.println(x+"^2 - "+D+"*"+y+"^2 = "+dio);
//						
//						if(x > bestX)
//							bestX = x;
//						breakBoth = true;
//						break;
//					}
//					
//					if(breakBoth)
//						break;
//				}
//			}
//		}
//		System.out.println("best x: "+bestX);
//	}
//	
//	//tested and working
//	public static boolean isSquare(int num)
//	{
//		int sqrt = (int) Math.sqrt(num);
//		return (sqrt*sqrt == num);
//	}
//	
//	public static BigInteger getDiophantine(BigInteger x, BigInteger y, BigInteger D)
//	{
//		BigInteger a = x.multiply(x);
//		BigInteger b = D.multiply(y).multiply(y);
//		return a.subtract(b);
//	}
//}