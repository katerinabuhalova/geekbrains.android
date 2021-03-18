package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> map = new HashMap<>();

    void add(String name, String phone) {
        if (map.containsKey(name)) {
            map.get(name).add(phone);
        } else {
            map.put(name, new ArrayList<>(Arrays.asList(phone)));
        }
    }

    ArrayList<String> get(String name) {
        return map.get(name);
    }
}
