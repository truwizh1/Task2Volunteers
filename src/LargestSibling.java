import java.util.Arrays;

public class LargestSibling {

    public static int findLargestSibling(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        Arrays.sort(digits);
        String sorted = new StringBuilder(new String(digits)).reverse().toString();
        return Integer.parseInt(sorted);
    }

    public static void main(String[] args) {
        int n = 213;
        System.out.println("Largest sibling of " + n + ": " + findLargestSibling(n));

        n = 553;
        System.out.println("Largest sibling of " + n + ": " + findLargestSibling(n));
    }
}
