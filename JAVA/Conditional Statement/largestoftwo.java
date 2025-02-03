import java.util.Scanner;

public class largestoftwo {
    
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter numbers a : ");
        a = sc.nextInt();
        System.out.print("Enter numbers b : ");
        b = sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater "+a);
        }
        else
        {
            System.out.println("b is greater "+b);
        }
        sc.close();
    }
}
