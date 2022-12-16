public class Utility {
    private Utility() {}

    public static boolean isPerfectSquare(int number) {
        if (isPrime(number)) { //A
            return false;
        }
        if (Math.sqrt(number)%1.0==0) {
            return true;
        }
        return false;
    }

    public static int numberOfFactors(int number) {
        int count = 0;
        for (int i=1;i<=number;i++) {
            if (number%i==0) {
                count++;
            }
        }
        return count;
    }
    private static boolean isPrime(int number) {
        for (int i=1;i<number;i++) {
            int count = 0;
            if (number%i==0) {
                count++;
            }
            if (count>2) {
                return false;
            }
        }
        return true;
    }
}
