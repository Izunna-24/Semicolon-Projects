package playsAndStuff;

import java.util.Scanner;

public class PlayThree {
    public static boolean isEven(int number){
        return number % 2 == 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if(isEven(num)){
            System.out.println("Its an even number: ");
        }
        else {
            System.out.println("not an even number");
        }
    }
}
