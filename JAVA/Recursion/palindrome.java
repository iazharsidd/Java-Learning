package Recursion;
import java.util.Scanner;

public class palindrome 
{
    public static boolean isPalindrome(String st)
    {
        int l = st.length();
        if (l <= 1) 
        {
            return true;   
        }
        if (st.charAt(0) != st.charAt(l - 1)) {
            return false;
        }
        return isPalindrome(st.substring(1, l-1));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String st = sc.nextLine();
        boolean ans = isPalindrome(st);
        if (ans == true) 
        {
            System.out.println(st+" is palindrome");
        }
        else
        {
            System.out.println(st + " is not palindrome");
        }
        sc.close();
    }  
}