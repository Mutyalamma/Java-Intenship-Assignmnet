import java.util.HashSet;
import java.util.Set;

public class duplicatesinset {
    public static void main(String[] args) {
        String str = "hello world";
        Set<Character> duplicates = new HashSet<>();
        Set<Character> noDuplicates = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char[] currentChar = str.charAt(i);
            if (noDuplicates.contains(currentChar)) {
                duplicates.add(currentChar);
            } else {
                noDuplicates.add(currentChar);
            }
        }

        System.out.println("Duplicate characters: " + duplicates);
    }
}
