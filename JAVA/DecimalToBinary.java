import java.util.Scanner;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
     int d,b=0,r,c=1;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Decimal Number : ");
     d = sc.nextInt();
     while (d>0)
    {
     r=d%2;
     r=r*c;
     b=b+r;
     c=c*10; 
     d=d/2;  
    }
    System.out.println(b);
     sc.close();
    }
}