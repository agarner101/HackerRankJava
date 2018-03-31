package warmup.p6_min_max;

/**
 * Min-Max
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
 * four of the five integers. Then print the respective minimum and maximum values as a single line
 * of two space-separated long integers.
 * Created by andrewgarner on 3/30/18.
 */
public class MinMax {

    public static void main(String[] args) {
        minMax(new int[]{1, 2, 3, 4, 5});
    }

    /**
     * Attempt 0.
     */
    private static void minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        long total = 0;

        for (int value : arr) {
            total += value;
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        String output = String.format("%d %d", (total - max), (total - min));
        System.out.println(output);
    }
}
