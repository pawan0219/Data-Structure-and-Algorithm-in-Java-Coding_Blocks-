package sorting.lec_22;

import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        int si = 10;
        int ei = 100;

        Random rn = new Random();
        for (int i = 0; i < 15; i++) {
             int v = rn.nextInt(ei - si + 1) + si;
        }
    }
}
