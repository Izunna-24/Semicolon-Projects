package playsAndStuff;

import java.util.Scanner;

public class VowelSound {
    public static boolean isVowel(char vowel) {
        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
        public static void main(String[] args) {
        Scanner next = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter = next.next().charAt(0);
        if (isVowel(letter)){
            System.out.println("yes vowel");
        }
        else {
            System.out.println("not a vowel");
        }
    }


    }
