import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateandCalendarExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		Date d= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
	}

}
