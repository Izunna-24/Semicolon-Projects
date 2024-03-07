package playsAndStuff;

public class FireDrillThree {

    public int[] taskOne(int scores) {
        String numberScores = scores + "";
        int length = numberScores.length();

        int[] arrayScores = new int[length];
        for (int count = 1; count <= 10; count++) {
            arrayScores[count] = scores;
        }
        return arrayScores;
    }

    public int[] taskTwo(int scores) {
        String numberScores = scores + "";
        int length = numberScores.length();

        int[] arrayScores = new int[length];
        for (int count = 1; count <= 10; count++) {
            arrayScores[count] = scores;
        }
        return arrayScores;
    }

    public int[] taskThree(int scores) {
        String numberScores = scores + "";
        int length = numberScores.length();

        int[] arrayScores = new int[length];
        for (int count = 1; count <= 10; count++) {
            arrayScores[count] = scores;
        }
        return arrayScores;

    }
}