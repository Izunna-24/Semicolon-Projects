package fireDrillFive;

public class ArraySwitch {
    public static boolean[] arrayOfNumbers(int... number) {
        boolean [] newArray = new boolean[number.length];
        for (int index = 0; index < number.length; index++) {
            newArray[index] = number[index] % 2 == 0;
        }
        return newArray;
    }
}
