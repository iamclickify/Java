package L1_Basics;

import java.util.Scanner;

public class EvenOdd_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        if (x % 2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
