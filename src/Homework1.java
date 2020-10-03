import java.util.LinkedHashMap;
import java.util.Map;

public class Homework1 {

    private  static final String [] ARR_DATA = {"a","a","c","b","d","t","j","b","c","h","n","m","g","w","g","p"};

    public static void main(String[] args) {
        Map<String, Integer> wordCounter = new LinkedHashMap<>();
        for (String word : ARR_DATA) {
            Integer count = wordCounter.get(word);
            if (count == null){
                count=0;
            }
            wordCounter.put(word, ++count);

        }
        for (String word : wordCounter.keySet()) {
            Integer count = wordCounter.get(word);
            System.out.println(word + ": " + count);

        }
    }

}
