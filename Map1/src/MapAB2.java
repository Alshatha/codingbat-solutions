import java.util.HashMap;
import java.util.Map;

public class MapAB2 {

    public static Map<String, String> mapAB2(Map<String, String> map) {
        // Check if both "a" and "b" exist and have the same value
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // Test 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "aaa");
        test1.put("b", "aaa");
        test1.put("c", "cake");
        System.out.println("Test 1: " + mapAB2(test1));
        // → {"c": "cake"}

        // Test 2
        Map<String, String> test2 = new HashMap<>();
        test2.put("a", "aaa");
        test2.put("b", "bbb");
        System.out.println("Test 2: " + mapAB2(test2));
        // → {"a": "aaa", "b": "bbb"}

        // Test 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "aaa");
        test3.put("b", "bbb");
        test3.put("c", "aaa");
        System.out.println("Test 3: " + mapAB2(test3));
        // → {"a": "aaa", "b": "bbb", "c": "aaa"}
    }
}
