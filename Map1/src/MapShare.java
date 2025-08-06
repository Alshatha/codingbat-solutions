import java.util.HashMap;
import java.util.Map;

public class MapShare {

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public static void main(String[] args) {
        // Test case 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "aaa");
        test1.put("b", "bbb");
        test1.put("c", "ccc");
        System.out.println("Test 1: " + mapShare(test1)); // → {"a":"aaa", "b":"aaa"}

        // Test case 2
        Map<String, String> test2 = new HashMap<>();
        test2.put("b", "xyz");
        test2.put("c", "ccc");
        System.out.println("Test 2: " + mapShare(test2)); // → {"b":"xyz"}

        // Test case 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "aaa");
        test3.put("c", "meh");
        test3.put("d", "hi");
        System.out.println("Test 3: " + mapShare(test3)); // → {"a":"aaa", "b":"aaa", "d":"hi"}
    }
}

