package chapterFive;

public class BarChart {
    public static void barchart(int b){
        for (int index = 1; index <= b; index++) {
            System.out.print(index+"*");
        }
            for (int count = 1; count <= b; count++) {
                System.out.print("\t");
                System.out.print("*");
            }


    }

    public static void main(String[] args) {
        barchart(4);
    }



}

