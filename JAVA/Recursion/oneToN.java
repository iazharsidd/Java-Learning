package Recursion;

import java.util.Scanner;

public class oneToN {
    public static void increasing(int a) {
        if (a == 0) {
            return;
        }
        increasing(a - 1);
        System.out.println(a + " ");
        return;
    }

    public static void main(String[] args) {
        int a;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        increasing(a);
        sc.close();
    }

}
