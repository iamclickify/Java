package L3_Arrays;

import static java.lang.Math.max;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {9, 0, 3, 2, 8, 7};

        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int cs = 0;
            for (int j = i; j < arr.length; j++) {
                cs += arr[j];
                ms = max(cs, ms);
            }
        }

        System.out.println("Maximum Subarray Sum = " + ms);
    }
}
