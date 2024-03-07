package fireDrillTwo;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int counter = 0;
        int sum = 0;
        for (int count = 1; count <= 4; count++){
            System.out.println("Enter Scores (0 - 100)");
            int scores = scanner.nextInt();
            if (scores >= 0 && scores <= 100){
                counter += 1;
                sum += scores;
                average = (double)sum/counter;

            }


        }

        System.out.printf("Average of valid scores: %.2f", average);
    }
}
