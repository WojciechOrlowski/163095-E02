import java.util.ArrayList;

public class zad2 {


    public static <E, I extends Iterable<E>> void wypiszCoDrugi(I obj) {
        ArrayList<E> result = new ArrayList<>();
        int count = 0;
        var iter = obj.iterator();
        result.add(iter.next());
        while (iter.hasNext()) {
            count = count + 1;
            E tm = iter.next();
            if(count == 2){
                result.add(tm);
                count = 0;
            }

        }
        System.out.println(result);
    }
}