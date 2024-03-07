package fireDrillTwo;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int counter = 0;
        int sum = 0;

        for (int count = 1; count <= 10; count++){
            System.out.println("Enter Scores");
            int scores  = scanner.nextInt();
            if(scores % 2 == 0){
                counter += 1;
                sum += scores;
                average = (double)sum/counter;
            }


        }
        System.out.printf("Sum of Scores that are even numbers: %d \nAverage of Scores: %.2f", sum, average);
    }
}


