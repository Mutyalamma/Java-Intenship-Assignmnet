import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> k= new ArrayList<>();
        k.add(34);
        k.add(89);
        k.add(12);
        k.add(5);
        k.add(15);
        Collections.sort(k, Collections.reverseOrder());
        System.out.println(k);
    }

}
