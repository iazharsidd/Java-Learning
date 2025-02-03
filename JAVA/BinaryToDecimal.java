import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args) 
    {
        int b, l, c = 0, d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");
        b = sc.nextInt();
        while (b > 0)
        {
            l = b % 10;
            d += l * Math.pow(2, c);
            c++;
            b /= 10;
        }
        System.out.println("Decimal Equivalent: " + d);
        sc.close();
    }
}