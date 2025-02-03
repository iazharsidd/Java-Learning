import java.util.Scanner;

public class funproduct 
{
    public static int product(int a,int b)
    {
          int product = a*b;
         return product;
    }
 public static void main(String[] args) {
    int n;
    int m;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    n=sc.nextInt();
     System.out.print("Enter the second number : ");
    m=sc.nextInt();
    int pro= product(n,m);
    System.out.println(pro);
     sc.close();
 }   
  
}
