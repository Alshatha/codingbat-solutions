import java.util.HashMap;
import java.util.Map;

public class MapBully {

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static void main(String[] args) {
        // Example 1
        Map<String, String> example1 = new HashMap<>();
        example1.put("a", "candy");
        example1.put("b", "dirt");
        System.out.println("Before: " + example1);
        System.out.println("After:  " + mapBully(example1));
        // Expected: After: {a=, b=candy}

        // Example 2
        Map<String, String> example2 = new HashMap<>();
        example2.put("a", "foo");
        System.out.println("Before: " + example2);
        System.out.println("After:  " + mapBully(example2));
        // Expected: After: {a=, b=foo}

        // Example 3
        Map<String, String> example3 = new HashMap<>();
        example3.put("b", "bar");
        System.out.println("Before: " + example3);
        System.out.println("After:  " + mapBully(example3));
        // Expected: After: {b=bar}
    }
}
