package fireDrillFive;

public class ArrayIndexManipulation {
    public static int[] addNumbers(int... number) {
        int[] newArray = new int[number.length];
        for (int index = 0; index < number.length; index++) {
            if (number[index] % 2 == 0) {
                newArray[index] = 0;
            } else {
                newArray[index] = 1;
            }
        }
        return newArray;
    }
}

