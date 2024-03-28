public class AlternatingString {

    public static String createAlternatingString(int n) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("+");
            } else {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Result for n=" + n + ": " + createAlternatingString(n));

        n = 8;
        System.out.println("Result for n=" + n + ": " + createAlternatingString(n));
    }
}
