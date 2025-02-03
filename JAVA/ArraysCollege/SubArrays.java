import java.util.Scanner;

public class SubArrays 
{
  public static void main(String[] args) 
  {
    int a;
    System.out.print("Enter the size of array : ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    int arr[]=new int[a];
    for (int i = 0; i < arr.length; i++) 
    {
      arr[i] = sc.nextInt();   
    } 
    for (int i = 0; i < arr.length; i++)
    {
     for (int j = i; j < arr.length; j++)
     {
       for (int k = i; k <= j; k++) 
       {
        System.out.print(arr[k]+" ");
       }
       System.out.println();
     }   
    }
    sc.close();
  }   
}
