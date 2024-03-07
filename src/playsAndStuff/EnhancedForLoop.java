package playsAndStuff;

import java.util.Arrays;
import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myList = new int[5];
        int total = 0;
        for (int count = 0; count <= 4; count++){
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            myList[count] = number;
            total += myList[count];

        }
        System.out.print(Arrays.toString(myList));
        System.out.print("Sum of list is:"+ total);

    }

}
