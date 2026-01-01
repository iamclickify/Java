package L2_Loops;

import java.util.Scanner;

public class CountDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        while (n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
