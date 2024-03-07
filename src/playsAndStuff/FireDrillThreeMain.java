package playsAndStuff;

import playsAndStuff.FireDrillThree;

import java.util.Arrays;
import java.util.Scanner;

public class FireDrillThreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FireDrillThree scorePoints = new FireDrillThree();
        int scores = 0;
        for (int index = 1; index <= 10; index++) {
            System.out.println("Enter Scores: ");
            scores = scanner.nextInt();
        }
        int[] scoreNumbers = scorePoints.taskOne(scores);

        System.out.println(Arrays.toString(scoreNumbers));
    }
}
