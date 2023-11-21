import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class datetime {
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLD = d04.minusDays(7);
		LocalDate nextWeekLD = d04.plusDays(7);
		
		System.out.println("pastWeekLD = " + pastWeekLD);
		System.out.println("nexttWeekLD = " + nextWeekLD);
		
		LocalDateTime pastWeekLDT = d05.minusHours(5);
		LocalDateTime nextWeekLDT = d05.plusSeconds(30);
		
		System.out.println("minus 5 hours = " + pastWeekLDT);
		System.out.println("next 30 second = " + nextWeekLDT);
		
		Instant pastWeekIn = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekIn = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past week instant = " + pastWeekIn);
		System.out.println("Next week instant = " + nextWeekIn);
		
		Duration t1 = Duration.between(pastWeekLDT, d05);
		
		System.out.println("t1 em dias = " + t1);
	}
}
