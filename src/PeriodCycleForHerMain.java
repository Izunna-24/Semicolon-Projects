import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class PeriodCycleForHerMain {
    public static void main(String[] args) {
        PeriodCycleForHer periodCycleForHer = new PeriodCycleForHer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHello, welcome to PeriodCycleForHer:), kindly enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("\nDear " + name + ", kindly note that we predict our dates based on the information you provide us!");

        System.out.println("\nEnter start day(1 - 31) of your last period");
        int startDay = scanner.nextInt();

        System.out.println("Enter start month(1 - 12) of your last period ");
        int startMonth = scanner.nextInt();

        System.out.println("Enter year of your last period ");
        int startYear = scanner.nextInt();

        System.out.println("Enter end day(1 - 31) of your last period");
        int endDay = scanner.nextInt();

        if ((endDay - startDay) >= 7 || (endDay - startDay) < 3) {
            System.out.println("We strongly advice that you see a doctor, as your menstrual days are abnormal");
        }

        else {
            System.out.println("Enter end month(1 - 12) of your last period ");
            int endMonth = scanner.nextInt();

            System.out.println("Enter end year of your last period ");
            int endYear = scanner.nextInt();

            System.out.println("What is your estimated menstrual cycle days ");
            int cycle = scanner.nextInt();
            if (cycle < 22 || cycle > 32){
                System.out.println("Dear " + name +", we strongly advice that you consult a doctor!");
            }

            else {
                LocalDate startDateOfPeriod = LocalDate.of(startDay, startMonth, startYear);
                LocalDate endDateOfPeriod = LocalDate.of(endDay, endMonth, endYear);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");


                String nextCycleStartDate = periodCycleForHer.knowYourMenstruationCycle(startDateOfPeriod, endDateOfPeriod, cycle);
                String nextOvulationDay = periodCycleForHer.knowYourOvulationDay(endDateOfPeriod);

                LocalDate rangeOfPeriod = periodCycleForHer.getNextCycle();
                rangeOfPeriod = rangeOfPeriod.plusDays((endDay - startDay));


                System.out.println("Dear " + name + ", your next menstrual cycle will likely begin on " + nextCycleStartDate);
                System.out.println("Your current menstrual cycle is " + cycle + " days");
                System.out.println("Your monthly period will likely begin on " + nextCycleStartDate + " and end on " + rangeOfPeriod);

                System.out.println("Your ovulation date will likely be on " + nextOvulationDay);

                List<LocalDate> freeDays = periodCycleForHer.knowYourFreeTime(endDateOfPeriod, LocalDate.parse(nextOvulationDay));
                System.out.println("Your free days are from " + freeDays.get(0).format(formatter) + " to " + freeDays.get(1).format(formatter));
                System.out.println("Your Fertile period will likely be from " + nextOvulationDay + " to " + nextCycleStartDate);
            }

        }
    }
}
