package fireDrillOne;

public class TaskSix {
    public static void main(String[] args) {

        for (int index = 1; index <= 10; index++) {
            if (index % 4 == 0) {
                int multiple = index;

            for (int count = 1; count <= 5; count++) {
                System.out.print(multiple + " ");
                multiple *= index;
            }

            }
        }
    }
}








