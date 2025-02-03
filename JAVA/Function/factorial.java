import java.util.Scanner;

public class factorial 
{
    public static int fact(int a)
    {
        int fa=1;
        if(a==0||a==1)
        {
        return 1;
        }
        else
        for (int i = 1; i <=a; i++) 
        {
            fa=fa*i;
        }
        return fa;
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=sc.nextInt();
       int f= fact(n);
       System.out.println(f);
       sc.close(); 
    }
}
