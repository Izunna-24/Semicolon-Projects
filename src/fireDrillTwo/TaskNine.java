package fireDrillTwo;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.println("Enter Scores (0 - 100)");
            int scores = scanner.nextInt();
            if (scores >= 0 && scores <= 100){
                sum += scores;
            }


        }

        System.out.printf("Sum of valid scores: %d", sum);
    }
}

