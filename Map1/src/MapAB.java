import java.util.HashMap;
import java.util.Map;

public class MapAB {

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        // Test case 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "Hi");
        test1.put("b", "There");
        System.out.println("Test 1: " + mapAB(test1)); // → {"a":"Hi", "b":"There", "ab":"HiThere"}

        // Test case 2
        Map<String, String> test2 = new HashMap<>();
        test2.put("a", "Hi");
        System.out.println("Test 2: " + mapAB(test2));

        // Test case 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("b", "There");
        System.out.println("Test 3: " + mapAB(test3));
    }
}
