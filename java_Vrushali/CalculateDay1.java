public class CalculateDay1
{
	public static void main(String args[])
	{
		int date=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		
		int daypassed=date;
		 
		int dayofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=0;i<month;i++)
		{
			daypassed = daypassed+dayofmonth[i];
		}
	 
		if(year%4==0 && month>2)
		{
			daypassed=daypassed+1;
		}
		
		System.out.println(daypassed);
		
		year=year-1;
		
		int mf=year%400;
		 
		int y=mf/100;			//Cal Number of century
		int totalyear=mf%100;
		
		int remaining =year-totalyear;
			
			int leap=0;
			
		for(int i=remaining+1;i<=year;i++)
		{
			if(i%4==0 && i%100!=0)
			{
				leap++;
			}
			else
			{
				if(i%400==0 && i%100==0)
				{
					leap++;
				}
			}
		}
		
		int oddyear=  totalyear-leap;
		
		int totaldays=daypassed+(y*5)+oddyear+(leap*2);
		int numofoddday=totaldays%7;
		
		System.out.println(numofoddday);
		
		switch(numofoddday)
		{
			case 0:
			System.out.println("sunday");
			break;
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wendsday");
			break;
			case 4:
			System.out.println("thrusday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
		}
	}
}