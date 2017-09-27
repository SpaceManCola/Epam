import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Collections {

    public static void main(String[] args) {
        List<Integer> l = makeList();
        System.out.println(l);
        Collection<?> lisIter = filter_iter(l);
        System.out.println("lisIter " + lisIter);
        List<Integer> lisMy = filter_my(l);
        System.out.println("lisMy " + lisMy);
        List<Integer> lisSteram = filter_stream(l);
        System.out.println("lisSteram " + lisSteram);
    }

    public static List<Integer> makeList(){
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while (i < 250){
            list.add((int)(Math.random()*100)-50);
            i++;
        }
        return list;
    }

    static Collection<?> filter_iter(Collection<?> c) {
        for (Iterator<?> it = c.iterator(); it.hasNext(); )
            if (condition(it.next()))
                it.remove();
        return c;
    }

    public static List<Integer> filter_my(List<Integer> c){
        int i = c.size() - 1;
        while (i>=0){
            if(condition(c.get(i))){
                c.remove(i);
            }
            i--;
        }
        return c;

    }

    public static List<Integer> filter_stream(List<Integer> c) {
        return c.stream()
                .filter((n) -> (n > 0) && (n%2==0))
                .collect(Collectors.toList());
    }

    private static boolean condition(Object next) {
        int ch = Integer.parseInt(next.toString());
        if ((ch <0)||!(ch%2==0)){
            return true;
        }
        return false;
    }
}
