import java.util.HashMap;
import java.util.Map;

public class Topping2 {

    public static Map<String, String> topping2(Map<String, String> map) {
        // If "ice cream" exists, set "yogurt" to same value
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        // If "spinach" exists, set it to "nuts"
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

    public static void main(String[] args) {
        // Test 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("ice cream", "cherry");
        System.out.println("Test 1: " + topping2(test1));
        // → {"ice cream":"cherry", "yogurt":"cherry"}

        // Test 2
        Map<String, String> test2 = new HashMap<>();
        test2.put("spinach", "dirt");
        test2.put("ice cream", "cherry");
        System.out.println("Test 2: " + topping2(test2));
        // → {"spinach":"nuts", "ice cream":"cherry", "yogurt":"cherry"}

        // Test 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("yogurt", "salt");
        System.out.println("Test 3: " + topping2(test3));
        // → {"yogurt":"salt"}
    }
}
