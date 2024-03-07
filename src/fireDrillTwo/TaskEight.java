package fireDrillTwo;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int counter = 0;
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.println("Enter Scores (0 - 100)");
            int scores = scanner.nextInt();
            while(scores < 0 || scores > 100){
                System.out.println("Wrong entry!\nEnter Scores (0 - 100): ");
                 scores = scanner.nextInt();
            }
        sum += scores;
        }

        System.out.printf("Sum of Scores: %d", sum);
    }
}


