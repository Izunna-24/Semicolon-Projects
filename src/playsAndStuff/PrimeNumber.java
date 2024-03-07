package playsAndStuff;

public class PrimeNumber {
    private static boolean isPrime(int number){
        for(int count = 2; count < number; count++){
            if (number % count == 0){
                return false;
            }
        }
        return true;
    }
}
