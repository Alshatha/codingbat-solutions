public class StringX {

    public static String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // Only skip 'x' if it's not at the start or end
            if (!(i > 0 && i < str.length() - 1 && str.substring(i, i + 1).equals("x"))) {
                result += str.substring(i, i + 1);

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
        System.out.println(stringX("xxxx"));
        System.out.println(stringX(""));
    }
}
