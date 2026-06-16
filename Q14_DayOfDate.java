import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Q14_DayOfDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the month(1-12)");
        int month = sc.nextInt();

        System.out.println("Input date (1-31)");
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(2004, month, day);

        System.out.println("Name of the date:");
        System.out.println(date.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        sc.close();
    }
}