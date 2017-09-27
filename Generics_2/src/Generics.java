import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Generics{
    public static List<? extends Number> sort(List<? extends Number> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

    public static void main(String arg[]) {
        List<Integer> intList = new ArrayList<>();
        intList.add(Integer.valueOf(12));
        intList.add(Integer.valueOf(17));
        intList.add(Integer.valueOf(14));
        intList.add(Integer.valueOf(15));
        System.out.println(Generics.sort(intList));

        List<BigInteger> bigIntList = new ArrayList<>();
        bigIntList.add(BigInteger.valueOf(150));
        bigIntList.add(BigInteger.valueOf(520));
        bigIntList.add(BigInteger.valueOf(30));
        bigIntList.add(BigInteger.valueOf(10));
        System.out.println(Generics.sort(bigIntList));


        List<BigDecimal> bigDecList = new ArrayList<>();
        bigDecList.add(BigDecimal.valueOf(66.666666666));
        bigDecList.add(BigDecimal.valueOf(8.5555555555555555555555555555555555555555555555555555555555555555550));
        bigDecList.add(BigDecimal.valueOf(66.666666666666666666666665555555555555555555555555));
        bigDecList.add(BigDecimal.valueOf(10.02));
        System.out.println(Generics.sort(bigDecList));

    }

}
