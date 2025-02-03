package Recursion;

import java.util.Scanner;

public class keypad 
{
    public static void Combination(String st,String[] kp,String res)
    {
        if (st.length()==0)
        {
            System.out.print(res+" ");
            return;
        }
        int curNum = st.charAt(0) - '0';
        String CurChoi = kp[curNum];
        for (int i = 0; i < CurChoi.length(); i++) 
        {
            Combination(st.substring(1), kp, res+CurChoi.charAt(i)); 
        }
    }
    public static void main(String[] args) 
    {
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number String : ");
        st =  sc.next();
        String[] kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Combination(st, kp, "");
        sc.close();
    }
}
