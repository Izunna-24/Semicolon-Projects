package chapterFive;

import java.util.Scanner;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int count = 1; count <= 10; count++) {
            for (int j = 1; j <= count; j++) {
                System.out.print('*');

            }
            System.out.println();

        }

        for (int count = 10; count >= 1; count--) {
            for (int j = 1; j <= count; j++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }

}
