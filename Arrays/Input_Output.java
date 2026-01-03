package Arrays;

import java.util.Scanner;

public class Input_Output {
    static void main() {
       /*
         int[] arr = {123,25,73,-56,23,98};
         System.out.println(arr.length);
         for (int i =0;i<=5;i++){
             System.out.print(arr[i]+ " ");
         }
       */

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i=0;i<=6;i++){ // input elements of array
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<=6;i++){ // output elements of array
            System.out.print(arr[i]+ " ");
        }
    }
}
