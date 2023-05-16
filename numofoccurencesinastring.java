import java.util.HashMap;
import java.util.Map;

public class numofoccurencesinastring {

    public static void main(String[] args) {
        String str = "Number of occurrences";
        Map<Character,Integer> charactercount = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (charactercount.containsKey(ch))
            {
                int count = charactercount.get(ch);
                charactercount.put(ch, count + 1);
            } else {
                charactercount.put(ch, 1);
            }

        }
        for (Map.Entry entry : charactercount.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

