package warmup.p4_plus_minus;

/**
 * Plus Minus
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
 * Print the decimal value of each fraction on a new line.
 * Created by andrewgarner on 3/30/18.
 */
public class PlusMinus {

    public static void main(String[] args) {
        System.out.println("Hello Diagonal Difference!");
        int[] array = new int[]{-4, 3, -9, 0, 4, 1};
        plusMinus(array);
    }

    /**
     * Attempt 0
     */
    private static void plusMinus(int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println((double) positiveCount / arr.length);
        System.out.println((double) negativeCount / arr.length);
        System.out.println((double) zeroCount / arr.length);

    }

}
