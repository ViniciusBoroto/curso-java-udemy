import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf1.format(new Date()));
	}
}