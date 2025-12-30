package L1_Basics;

import java.util.Scanner;

public class Largestof3numbers_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if (a == b && b == c){
            System.out.println("All numbers are equal"); // exception case
        }

        if (a > b && a > c){
            System.out.println("a is largest");
        }
        else if (b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
