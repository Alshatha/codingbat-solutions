import java.util.HashMap;
import java.util.Map;

public class MapAB4 {

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");

            if (aVal.length() > bVal.length()) {
                map.put("c", aVal);
            } else if (bVal.length() > aVal.length()) {
                map.put("c", bVal);
            } else { // same length
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // Test 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "aaa");
        test1.put("b", "bb");
        test1.put("c", "cake");
        System.out.println("Test 1: " + mapAB4(test1));
        // → {"a": "aaa", "b": "bb", "c": "aaa"}

        // Test 2
        Map<String, String> test2 = new HashMap<>();
        test2.put("a", "aa");
        test2.put("b", "bbb");
        test2.put("c", "cake");
        System.out.println("Test 2: " + mapAB4(test2));
        // → {"a": "aa", "b": "bbb", "c": "bbb"}

        // Test 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "aa");
        test3.put("b", "bbb");
        System.out.println("Test 3: " + mapAB4(test3));
        // → {"a": "aa", "b": "bbb", "c": "bbb"}

        // Test 4 - equal lengths
        Map<String, String> test4 = new HashMap<>();
        test4.put("a", "xy");
        test4.put("b", "zt");
        System.out.println("Test 4: " + mapAB4(test4));
        // → {"a": "", "b": ""}
    }
}
