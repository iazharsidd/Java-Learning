import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) 
        {
            int a;
            int b;
            char c;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the case : ");
            c =sc.nextLine().charAt(0);
            if (c=='+'||c=='-'||c=='*'||c=='/'||c=='%')
             {
             System.out.print("Enter the number a : ");
             a=sc.nextInt();
             System.out.print("Enter the number b : ");
             b=sc.nextInt();
             switch (c)
             {
                 case '+':
                 int sum=a+b;
                 System.out.println("The Sum of a and b is " +sum);
                 break;
                 case '-':
                 int dif=a-b;
                 System.out.println("The Difference of a and b is " +dif);
                 break; 
                 case '*':
                 int product=a*b;
                 System.out.println("The Product of a and b is " +product);
                 break;
                 case '/':
                 int quo=a/b;
                 System.out.println("The Quotient of a and b is " +quo);
                 break;
                 case '%':
                 int rem = a%b;
                 System.out.println("The Remainder is of a and b is "+rem);
                 break;
                 default:
                 System.out.println("No case is matched");
                 break;
             }
            }
            else
            System.out.println("Please Enter a valid operator"); 
            sc.close();
        }
}
