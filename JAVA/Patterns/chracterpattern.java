import java.util.Scanner;

public class chracterpattern
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n=sc.nextInt();
        char ch='A';
        for (int i = 1; i <=n; i++)
        {
            for (int j = 1; j <=i; j++)
            {
                System.out.print(ch);
                 ch++;
            }
            System.out.println("");
        }
        sc.close();
    }
}
