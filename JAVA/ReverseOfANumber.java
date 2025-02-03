import java.util.Scanner;


public class ReverseOfANumber {
    public static void main(String[] args) {
        int n;
        int last;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n=sc.nextInt();
        while (n>0)
        {
            last=n%10;
            n=n/10;
            System.out.print(last);
        }
        sc.close();
    }
}
