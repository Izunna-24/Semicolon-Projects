package personalTasks;

public class Maximum {

    public  static int max(int num1, int num2, int num3) {
        //int max = num1;
        //if(num2 > max) max = num2;
        //if(num3 > max)max = num3;
        return Math.max(num1,Math.max(num2,num3));
            }
   public static int maxNegative(int num1, int num2, int num3){
        int max = num3;
        if(num1 > max)max = num1;
        if(num2 > max)max = num2;
        return max;
   }
}



