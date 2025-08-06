import java.util.HashMap;
import java.util.Map;

public class MapAB3 {

    public static Map<String, String> mapAB3(Map<String, String> map) {
        boolean hasA = map.containsKey("a");
        boolean hasB = map.containsKey("b");

        // If exactly one of "a" or "b" exists
        if (hasA && !hasB) {
            map.put("b", map.get("a"));
        } else if (!hasA && hasB) {
            map.put("a", map.get("b"));
        }

        return map;
    }

    public static void main(String[] args) {
        // Test 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "aaa");
        test1.put("c", "cake");
        System.out.println("Test 1: " + mapAB3(test1));
        // → {"a": "aaa", "b": "aaa", "c": "cake"}

        // Test 2
        Map<String, String> test2 = new HashMap<>();
        test2.put("b", "bbb");
        test2.put("c", "cake");
        System.out.println("Test 2: " + mapAB3(test2));
        // → {"a": "bbb", "b": "bbb", "c": "cake"}

        // Test 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "aaa");
        test3.put("b", "bbb");
        test3.put("c", "cake");
        System.out.println("Test 3: " + mapAB3(test3));
        // → {"a": "aaa", "b": "bbb", "c": "cake"}
    }
}
