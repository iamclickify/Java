package Arrays;

import java.util.Scanner;

public class array_q1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Negative elements of array are: ");
        for (int i = 0;i<n;i++){
            if (arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
