public class Prob017
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println(getNumberName(i));
			sum += removeSpaces(getNumberName(i)).length();
		}
		
		System.out.println(sum);
	}
	
	public static String getNumberName(int num)
	{
		String output = "";
		if(num < 100)
		{
			output += easyTens(num);
		}
		else if(num % 100 == 0 && num != 1000)
		{
			output += ones(num/100);
			output += " hundred";
		}
		else if(num < 1000)
		{
			output += ones(num/100);
			output += " ";
			output += "hundred and ";
			
			output += easyTens(num - num/100*100);
		}
		else if(num == 1000)
		{
			output = "one thousand";
		}
		return output.trim();
	}
	
	public static String ones(int num)
	{
		switch(num)
		{
		case 0: return "";
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		}
		return "";
	}
	
	public static String teens(int num)
	{
		switch(num)
		{
		case 10: return "ten";
		case 11: return "eleven";
		case 12: return "twelve";
		case 13: return "thirteen";
		case 14: return "fourteen";
		case 15: return "fifteen";
		case 16: return "sixteen";
		case 17: return "seventeen";
		case 18: return "eighteen";
		case 19: return "nineteen";
		}
		return "";
	}
	
	public static String tens(int num)
	{
		switch(num)
		{
		case 20: return "twenty";
		case 30: return "thirty";
		case 40: return "forty";
		case 50: return "fifty";
		case 60: return "sixty";
		case 70: return "seventy";
		case 80: return "eighty";
		case 90: return "ninety";
		}
		return "";
	}
	
	public static String easyTens(int num)
	{
		String output = "";
		if(num < 10)
		{
			output += ones(num);
		}
		else if(num < 20)
		{
			output += teens(num);
		}
		else if(num < 100)
		{
			output += tens(num/10*10);
			output += " ";
			output += ones(num - num/10*10);
		}
		return output;
	}
	
	public static String removeSpaces(String numberName)
	{
		numberName = numberName.replace(" ","");
		return numberName;
	}
	
}
