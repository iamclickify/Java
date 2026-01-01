package L2_Loops;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int r = 0;
        while(n!=0){
            r = r*10;
            r = r + n%10;
            n =  n/10;
        }
        System.out.println(r);
    }
}
