package warmup.p7_birthday_candles;

/**
 * Birthday Cake Candles
 * You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle
 * for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones.
 * <p>
 * Complete the function birthdayCakeCandles that takes your niece's age and an integer array
 * containing height of each candle as input, and return the number of candles she can successfully blow out.
 * <p>
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * Created by andrewgarner on 3/30/18.
 */
public class BirthdayCandles {

    /**
     * Attempt 0
     */
    static int candles0(int n, int[] ar) {
        int count = 0;
        int max = 0;
        for (int i : ar) {
            if (i > max) {
                count = 1;
                max = i;
            } else if (i == max) {
                count++;
            }
        }
        return count;
    }
}
