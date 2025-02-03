package Recursion;

public class BinString 
{
    public static void BiString(int n ,int lp, String st)
    {
        if (n == 0)
        {
            System.out.println(st);
            return;
        }
        BiString(n-1,0,st+"0");
        if (lp == 0)
        {
            BiString(n-1, 1, st+"1");   
        }
    }
    public static void main(String[] args) 
    {
        BiString(3, 0, "");
    }
}
