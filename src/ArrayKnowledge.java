import java.util.Arrays;

public class ArrayKnowledge {
    public static void main(String[] args) {

        test("Pork");
        test("Chops");
        test("Gurugamesh");
        test("Life Is Pain");
    }

    public static void test(String example) {
        System.out.println(Arrays.toString(stringToArray(example)));
        System.out.print("\n");
    }

    public static char[] stringToArray(String input) {
        char[] charArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            charArray[i] = input.charAt(i);
        }
        return charArray;
    }
}


