import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default date
		Date d = new Date();
		System.out.println(d.toString());
		
		
		// when we want to format a date in any specific manner then we use simpledateformat class
		
		SimpleDateFormat sdf= new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d));
		
		// Another format 
		SimpleDateFormat sdf1=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf1.format(d));

	}

}
