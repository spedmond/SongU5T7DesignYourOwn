public class Custom {
    private String name;
    private static int timesRun;

    public Custom (String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hi " + name);
        timesRun++;
    }

    public static int getTimesRun() {
        return timesRun;
    }
}
