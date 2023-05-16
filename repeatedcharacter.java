import java.util.HashSet;
import java.util.Set;

public class repeatedcharacter {
    public static void main(String[] args) {
        String str = "hello world";
        Set<Character> characterSet=new HashSet<>();
        for(int i=0;i<str.length();i++) {
            if(characterSet.contains(str.charAt(i))) {
                System.out.println("First Repeating character is "+str.charAt(i));
                break;
            }else {
                characterSet.add(str.charAt(i));
            }}
        }
}
