package L3_Arrays;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {9, 0, 3, 2, 8, 7};

        int cs = arr[0]; // current sum
        int ms = arr[0]; // maximum sum

        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(ms, cs);
        }

        System.out.println("Maximum Subarray Sum = " + ms);
    }
}
