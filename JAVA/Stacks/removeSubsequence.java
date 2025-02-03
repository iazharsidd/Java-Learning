package Stacks;

import java.util.*;

public class removeSubsequence 
{
  public static Stack<Character> subs(String s)
  {
    Stack <Character> st = new Stack<>();
    int n = s.length();
    for (int i = 0; i < n; i++) 
    {
      char ch = s.charAt(i);
      if (i < n - 1 && ch == s.charAt(i + 1)) 
      {
        while (i < n - 1 && ch == s.charAt(i + 1)) 
        {
          i++;
        }
      } 
      else 
      {
      st.push(ch);
      }
    } 
    return st;
  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String :");
    String st = sc.nextLine();
    System.out.println(subs(st));
    sc.close();
  }
}
