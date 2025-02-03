import java.util.Scanner;

import Recursion.GCDEuclid;

public class lcm 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int lcm = (a * b) / GCDEuclid.gcdrec(a, b);

        System.out.println("LCM: " + lcm);

        scanner.close();
    }
}