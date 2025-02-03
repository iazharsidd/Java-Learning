import java.util.Scanner;

public class passfailternary {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        marks = sc.nextInt();
        String var = (marks>=33)? "Pass":"Fail";
        System.out.println(var );
        sc.close();
    }
}
