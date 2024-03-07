package playsAndStuff;

public class Palindrome {
    public static boolean isPalindrome(String numbers) {
        int number = Integer.parseInt(numbers);
        int reverse = 0;
        int palindrome = 0;
        int next = number;

        while (number > 0) {
            reverse = number % 10;
            palindrome = palindrome * 10 + reverse;
            number /= 10;

        }
        return palindrome == next;
    }
}





