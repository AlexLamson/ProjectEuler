import java.util.Calendar;


public class Prob019
{
	public static String[] weekdays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday"};
	
	public static void main(String[] args)
	{
//		Calendar old = Calendar.getInstance();
//		old.set(1900, 0, 1);
//		System.out.println(weekdays[old.get(Calendar.DAY_OF_WEEK) - 1]);
		
		Calendar old = Calendar.getInstance();
		int totalSundays = 0;
		for(int year = 1901; year < 2001; year++)
		{
			for(int month = 0; month < 12; month++)
			{
				old.set(year, month, 1);
				if(weekdays[old.get(Calendar.DAY_OF_WEEK) - 1].equals("Sunday"))
					totalSundays++;
			}
		}
		
		System.out.println(totalSundays);
	}
}
