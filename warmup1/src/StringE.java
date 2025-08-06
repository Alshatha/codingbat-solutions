public class StringE {

    public static boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // Alternative: if (str.substring(i, i+1).equals("e")) count++;
        }

        return (count >= 1 && count <= 3);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelele"));
        System.out.println(stringE("Hi"));
        System.out.println(stringE("e"));
        System.out.println(stringE("eeee"));
    }
}

