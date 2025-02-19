package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		simpleDateFormat.format(date);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 mm월 dd일");
		
		System.out.println(date);
		System.out.println(simpleDateFormat.format(date));
		
		try {
			simpleDateFormat.parse("1900년 12월 4일");
			System.out.println(LocalDate.parse("1900년 12월 4일", dateTimeFormatter));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
