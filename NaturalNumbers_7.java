package L1_Basics;

import java.util.Scanner;

public class NaturalNumbers_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        for (int i=1;i<=x;i++){
            System.out.println(i);
        }
    }
}
