package L1_Basics;

import java.util.Scanner;

public class SumNaturalNumbers_8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int sum=0;
        for (int i = 0;i<=x;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
