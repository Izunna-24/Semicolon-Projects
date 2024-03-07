package fireDrillTwo;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        double average = 0;
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.println("Enter Scores");
            int scores  = scanner.nextInt();
            if(scores % 2 == 0) {
                counter += 1;
                sum += scores;
                average = (double) sum / counter;
            }
            }

        System.out.printf("Average of scores entered: %.2f", average);
        }

    }

