package algorithms.p5_breaking_records;

/**
 * Breaking the records
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * Created by andrewgarner on 3/31/18.
 */
public class BreakingRecords {

    /**
     * Attempt 0
     */
    static int[] breakingRecords0(int[] scores) {
        int[] record = new int[]{0, 0};
        int min = scores[0];
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            int score = scores[i];
            if (score > max) {
                max = score;
                record[0]++;
            } else if (score < min) {
                min = score;
                record[1]++;
            }
        }
        return record;
    }
}
