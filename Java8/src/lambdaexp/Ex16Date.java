package lambdaexp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex16Date {

	public static void main(String[] args) throws InterruptedException {
//		LocalTime start = LocalTime.now();
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		//date
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate yesterday = today.minusDays(20);
		System.out.println(yesterday);
		
		LocalDate tommorow = today.plusDays(50);
		System.out.println(tommorow);
		
		int day = today.getDayOfYear();
		System.out.println(day);
		
		int month = today.getMonthValue();
		System.out.println(month);
		
		// time
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		System.out.println(now.getHour());
		System.out.println(now.plusHours(5));
		System.out.println(now.minusHours(23));
		
		LocalDateTime dnt = LocalDateTime.now();
		System.out.println(dnt);
		
//		LocalTime stop = LocalTime.now();

		
		// formatting date
		String randomDate = "1996-04-14";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate randomDay = LocalDate.parse(randomDate , format);
		System.out.println(randomDay);
		System.out.println(randomDay.isLeapYear());
		
		//time zone
		ZonedDateTime zn = ZonedDateTime.now();
		System.out.println(zn.getZone());
		
		ZoneId india = ZoneId.of("Asia/Calcutta");
		ZoneId japan = ZoneId.of("Asia/Tokyo");
		
		LocalTime t1 = LocalTime.now(india);
		LocalTime t2 = LocalTime.now(japan);
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.isBefore(t2));
		
		
		
		Thread.sleep(5000);
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}

}