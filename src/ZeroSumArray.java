import java.util.Arrays;

public class ZeroSumArray {

    public static int[] createZeroSumArray(int n) {
        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
            sum += result[i];
        }

        result[n - 1] = -sum;
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Array for n=" + n + ": " + Arrays.toString(createZeroSumArray(n)));

        n = 3;
        System.out.println("Array for n=" + n + ": " + Arrays.toString(createZeroSumArray(n)));
    }
}
