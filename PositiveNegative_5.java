package L1_Basics;

import java.util.Scanner;

public class PositiveNegative_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        if (x>0){
            System.out.println("Positive");
        }
        else if(x<0){
            System.out.println("Negative");
        }
        else System.out.println("It is zero");
    }
}
