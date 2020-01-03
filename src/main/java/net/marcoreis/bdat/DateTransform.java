package net.marcoreis.bdat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTransform {

    public static List<String> changeDateFormat(List<String> dates) {
		List<String> result = new ArrayList<>();
		String[] formats =
				{ "yyyy/MM/dd", "dd/MM/yyyy", "MM-dd-yyyy" };
		SimpleDateFormat sdfOut =
				new SimpleDateFormat("yyyyMMdd");
		//
		for (String date : dates) {
			for (String format : formats) {
				SimpleDateFormat sdfIn =
						new SimpleDateFormat(format);
				sdfIn.setLenient(false);
				try {
					result.add(
							sdfOut.format(sdfIn.parse(date)));
					break;
				} catch (ParseException e) {
					//System.out.println("Not valid: " + date);
				}
			}
		}
		return result;
	}
    
    public static void main(String[] args) {        
        List<String> dates = changeDateFormat(Arrays.asList("2010/03/30", "12/15/2016", "11-15-2012", "20130720"));
        for(String date : dates) {
            System.out.println(date);
        }
    }
}