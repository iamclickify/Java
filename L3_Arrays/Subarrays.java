package L3_Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int[] arr = {9, 0, 3, 2, 8, 7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
