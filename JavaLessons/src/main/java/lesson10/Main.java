package lesson10;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Яблоко", "Банан", "Апельсин", "Яблоко", "Киви", "Апельсин", "Грейпфрут", "Яблоко", "Груша", "Киви", "Яблоко"));
        ListIterator<String> iterator = arrayList.listIterator();
        Map<String, Integer> map = new HashMap<>();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        for (Map.Entry<String, Integer> o : map.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}
