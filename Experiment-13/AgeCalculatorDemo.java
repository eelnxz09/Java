import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year (e.g. 2004): ");
        int year = sc.nextInt();
        System.out.print("Enter birth month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter birth day (1-31): ");
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Calculated Age: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");

        sc.close();
    }
}
