
import java.time.Instant;
import java.util.TimeZone;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DatasUsandoSDF {

	public static void main(String[] args) throws ParseException {
		// SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		// SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
	    
		Date x1 = new Date(30/10/2023);
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date (0L);
		Date x4 = new Date (1000L * 60L * 60L * 5L);
		// Date y1 = (Date) sdf1.parse("30/10/2023");
		// Date y2 = (Date) sdf2.parse("30/10/2023 15:30:50");
		// Date y3 = (Date) Date.from(Instant.parse("2020-02-15T12:34:00"));
		
		
		
		// classe calendar
		Calendar cal = Calendar.getInstance();
		
		System.out.println(" Data e hora atual: " + cal.getTime());
		
		Date data = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(" Data formatada atual: " + sdf1.format(data));
		System.out.println(" Data formatada atual: " + sdf2.format(data));
	}

}
