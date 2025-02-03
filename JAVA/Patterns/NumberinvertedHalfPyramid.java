import java.util.Scanner;

public class NumberinvertedHalfPyramid
{
    public static void main(String[] args) 
    {
     int r;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Number of rows : ");
     r= sc.nextInt();
     for (int i = 0; i < r; i++)
     {
       for (int j = 1; j <= r-i; j++)
        {
           System.out.print(j+" ");
        }  
        System.out.println();
     }   
     sc.close();
    }
}