import java.util.HashMap;
import java.util.Map;

public class Topping1 {

    public static Map<String, String> topping1(Map<String, String> map) {
        // Always set "bread" to "butter"
        map.put("bread", "butter");

        // If "ice cream" exists, change its value to "cherry"
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        return map;
    }

    public static void main(String[] args) {
        // Test 1
        Map<String, String> test1 = new HashMap<>();
        test1.put("ice cream", "peanuts");
        System.out.println("Test 1: " + topping1(test1)); // → {"ice cream":"cherry", "bread":"butter"}

        // Test 2
        Map<String, String> test2 = new HashMap<>();
        System.out.println("Test 2: " + topping1(test2)); // → {"bread":"butter"}

        // Test 3
        Map<String, String> test3 = new HashMap<>();
        test3.put("pancake", "syrup");
        System.out.println("Test 3: " + topping1(test3)); // → {"pancake":"syrup", "bread":"butter"}
    }
}
