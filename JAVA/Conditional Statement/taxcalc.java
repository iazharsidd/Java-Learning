import java.util.Scanner;

public class taxcalc {
    public static void main(String[] args) {
        double i;
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income: ");
        i= sc.nextDouble();
        if (i<500000)
        {
            System.out.println("Income tax is 0%");
        }
        else if (i>=500000 && i<1000000)
        {
            tax=(i*0.2);
            System.out.println("Tax is 20% "+tax);
        }
        else if (i>=1000000)
        {
            tax=(i*0.3);
            System.out.println("Tax is 30% "+tax);
        }
        sc.close();
    }
}
