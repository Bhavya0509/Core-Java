import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//difference between date and calendar is just that in date we use date class object and in calendar we use 
		//calendar instance
		
		Calendar cal=Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
	    System.out.println(sdf.format(cal.getTime()));
	    
	    
	    //Some unique features of calendar
	    
	    System.out.println(cal.get(Calendar.AM_PM));
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}

}
