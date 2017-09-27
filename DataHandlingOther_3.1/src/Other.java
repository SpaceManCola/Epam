import java.math.BigDecimal;

public class Other {
    public static void main(String[] args) {
        System.out.format("ѕлощадь круга равна %1.50f", areaCircle(0.45));
    }
    public static BigDecimal areaCircle(double R) {
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal rad = new BigDecimal(R);
        return rad.multiply(rad).multiply(pi);
    }
}
