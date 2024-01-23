import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
	public static void main(String[] args) {

		Instant d01 = Instant.parse("2023-01-22T23:04:00Z");
		LocalDateTime ld01 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
		System.out.println(ld01);
	}
}