import java.util.Scanner;

public class DToB 
{
    public static void main(String[] args)
    {
     int d , r,b=0,p=0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a decimal number: ");
     d=sc.nextInt();
     while (d>0)
     {
      r=d%2;
      b+= r*Math.pow(10, p);
      p++;
      d=d/2;
     }
     System.out.println(b);
     sc.close();
    }    
}
