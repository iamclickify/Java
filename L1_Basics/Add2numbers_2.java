package L1_Basics;

import java.util.Scanner;

public class Add2numbers_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int x = sc.nextInt();
        System.out.println("Enter num2 : ");
        int y = sc.nextInt();
        int result = x + y;
        System.out.println("Addition of 2 numbers is : ");
        System.out.print(result);
    }
}
