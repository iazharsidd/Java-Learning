import java.util.Scanner;

public class elseif {
        public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();
        System.out.println("Enter the value of c:");
        c = sc.nextInt();
        if (a==b && b==c)
        System.out.println("a and b and c are equal");
        else if(a>b && a>c)
        System.out.println("a is the largest");
        else if(b>a && b>c)
        System.out.println("b is the largest");
        else
        System.out.println("c is the largest");
        sc.close();
        }
}
