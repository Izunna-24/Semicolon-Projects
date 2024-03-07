package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.println("Enter Scores");
            int scores  = scanner.nextInt();
            if(count % 2 == 0){
                System.out.println(scores +" ");
                sum += scores;
            }


        }
        System.out.printf("Sum of Scores on even indexes: %d", sum);
    }
}
