public class Methods {
    private int number;
    private static int timesRun;

    public Methods(int number) {
        this.number = number;
    }

    public void printInfo() {
        if (canContinue()) { //G
            timesRun++;
            System.out.println(number); //E
            System.out.println("number of factors: " + Utility.numberOfFactors(number)); //H
            System.out.println("is it a perfect square? " + Utility.isPerfectSquare(number));
            System.out.println("number length: " + numLength(number)); //F
        }
    }

    public static int numLength(int number) {
        String hey = "" + number + "also number of factors: " + Utility.numberOfFactors(number); //J
        return hey.length();
    }
    private static boolean canContinue() {
        if (timesRun<10) {
            return true;
        }
        return false;
    }
}
