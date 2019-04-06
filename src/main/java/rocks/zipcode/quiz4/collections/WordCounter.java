package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] strings;

    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> mappyMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!mappyMap.containsKey(strings[i])) {
                mappyMap.put(strings[i], 1);
            } else {
                mappyMap.put(strings[i], mappyMap.get(strings[i]) + 1);
            }
        }
        return mappyMap;
    }
}