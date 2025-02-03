import java.util.Scanner;

public class HollowRect 
{
 public static void main(String[] args) {
    int r,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    r=sc.nextInt();
    System.out.print("Enter the number of coloumns: ");
    c=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
        for (int j = 1; j <=c; j++)
        {
           if (i==1||i==r||j==1||j==c)
           {
            System.out.print("*");
           } 
           else
           System.out.print(" ");
        }
           System.out.println();
    }
    sc.close();
 }   
}