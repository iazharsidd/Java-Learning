import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
