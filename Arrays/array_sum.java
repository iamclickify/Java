package Arrays;

import java.util.Scanner;

public class array_sum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter elements of array");
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i =0;i<n;i++){
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
