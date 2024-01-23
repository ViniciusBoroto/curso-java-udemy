import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
	public static void main(String[] args) {

		int inputNum = -121;
		String inputStr = String.valueOf(inputNum);
		String[] charArray = inputStr.split("");
		for (String s : charArray) {
			System.out.println(s);
		}
		
	}
}