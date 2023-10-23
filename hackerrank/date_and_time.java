package hackerrank;

import java.util.*;

public class date_and_time {
    public static void main(String[] args)  {
        try (Scanner scanner = new Scanner(System.in)) {
			int month = scanner.nextInt();
			int day   = scanner.nextInt();
			int year  = scanner.nextInt();

			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.DATE, day);
			calendar.set(Calendar.MONTH, month - 1);
			calendar.set(Calendar.YEAR, year);

			System.out.print("Day Name :- ");
			System.out.print(calendar.getDisplayName(Calendar.DAY_OF_WEEK,
					Calendar.LONG, new Locale("en", "US")).toUpperCase());
		}
    }
}