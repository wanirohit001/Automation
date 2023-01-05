package utilsprogram;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class utilcamparecalender2 {
public static void main(String[] args) throws ParseException 
 { 
	SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-mm-dd");
	Date D1 = DateFormat.getDateInstance().parse("2022-12-26");	
    Date D2 = DateFormat.getDateInstance().parse("2022-01-28");
	System.out.println("campare dates ="+D1.equals(D2));
 }

}
