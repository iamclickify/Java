package L2_Loops;

import java.util.Scanner;

public class RaiseTo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter power of the number: ");
        int b = sc.nextInt();
        int pow = 1;
        for (int i=1;i<=b;i++){
            pow = n*pow;
        }
        System.out.println(pow);
    }
}
