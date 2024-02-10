
public class MonthDays 
{
	private int month;
	private int year;
	
	//constructor
	public MonthDays(int m, int y)
	{
		month = m;
		year = y;
	}
	
	//method to get number of days
	public int getNumberOfDays()
	{
		int days = 0;
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || 
		   month == 8 || month == 10 || month == 12)
		{
			days = 31;
		}
		else if(month == 2)
		{
			if((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
			{
				days = 29;
			}
			else
			{
				days = 28;
			}
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			days = 30;
		}
	    return days;
	}
}
