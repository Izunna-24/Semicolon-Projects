import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number = "9k";
        int num = 0;

        try {
            num += add(number);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        num += 10;
        System.out.println(num);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number:");



//        System.out.println("Hello world!");
    }

    public static int add(String num) {
        boolean condition = dataValidator(num);
        if (!condition) {
            throw new ArrayIndexOutOfBoundsException("not valid");
        }
        return 20 + Integer.parseInt(num);
    }

    private static boolean dataValidator(String num) {
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit < 0 || digit > 9) return false;
        }
        return true;
    }
}