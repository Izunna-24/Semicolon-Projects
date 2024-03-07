package fireDrillTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.println("Enter Scores");
            int scores  = scanner.nextInt();
            scores += 1;
            sum += scores;
            average = sum/(double)scores;


        }
        System.out.printf("Average of scores: %.2f \nSum of Scores: %d", average, sum);
    }


}
