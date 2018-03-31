package warmup.p5_staircase;

/**
 * Staircase
 * Write a program that prints a staircase of size N.
 * <p>
 * Example for n = 4:
 * ...#
 * ..##
 * .###
 * ####
 * (Where "." are spaces, using periods for visual purposes)
 * Created by andrewgarner on 3/30/18.
 */
public class Staircase {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("N = " + i);
            staircase1(i);
        }
    }

    /**
     * Attempt 1. Consolidated 2 loops into 1 loop and a conditional check
     */
    private static void staircase1(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    sb.append(".");
                } else {
                    sb.append("#");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    /**
     * Attempt 0
     */
    private static void staircase0(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                sb.append(".");
            }
            for (int j = n - i - 1; j < n; j++) {
                sb.append("#");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
