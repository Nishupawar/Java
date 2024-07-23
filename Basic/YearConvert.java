//convert year into month into week into days
public class YearConvert {
	public static void main(String[] args)
	{
		//800 days
		int day=800;
		int year= day/365;
		System.out.println("Year : "+year);
		int remDays=day% 365;
		
		int month =remDays/30;
		System.out.println("Months :"+month);
		int remDays1=remDays%30;
		
		int week = remDays1/7;
		System.out.println("Week :"+week);
		int days= remDays1%7;
		System.out.println("Remaining days :"+days);
	}
	
}

