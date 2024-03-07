package playsAndStuff;

public class PlayOne {
    public static void main(String[] args) {
        System.out.println("Headline Sponsor");
        displayLine(50);
        displayStar(20);
        System.out.println("Globacom and Others");
        displayLine(30);
        displayStar(40);
    }
    public static void displayLine(int c){
        for (int index = 0; index < c; index++){
            System.out.print("_");
        }
        System.out.println(" ");
    }

    public static void displayStar(int c){
        for(int index = 0; index < c; index++ ){
            System.out.print("*");
        }
        System.out.println(" ");
    }

}
