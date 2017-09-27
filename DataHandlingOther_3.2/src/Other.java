public class Other {
    public static void main(String[] args) {
        compareNumbers("0.12", "0.13", "0.25");
    }

    public static void compareNumbers(String s1, String s2, String s3) {
        double d1 = Double.valueOf(s1);
        double d2 = Double.valueOf(s2);
        double d3 = Double.valueOf(s3);
        if (d1 + d2 == d3) {
            System.out.println("Третье число является суммой двух первых.");
        }
        else {
            System.out.println("Третье число не является суммой двух первых.");
        }
    }
}
