package fireDrillFour;

import java.util.Scanner;

public class PrintAsteriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //while ( int count > 0 && count) {
            asteriksPrinter(4);
        }
    //}


    public static void asteriksPrinter(int ast) {
        for(int index = 1; index <= ast; index++) {
                System.out.print(index + "*");
            }
            for (int count = 1; count <= ast; count++) {
                System.out.print("\t");
                System.out.print("*");
            }
        }


    }

