import java.util.ArrayList;

public class Removeduplicatesfromlist {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();
        name.add("Hello");
        name.add("Ram");
        name.add("Hello");
        name.add("rahul");
        name.remove(2);
        System.out.println(name);
    }
}
