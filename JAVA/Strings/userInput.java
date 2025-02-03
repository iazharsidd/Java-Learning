package Strings;

import java.util.*;
public class userInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st= sc.next();
        System.out.println(st);//ignore everything after space 
        st = sc.nextLine();//takes the whole input even after the space 
        System.out.println(st);
        System.out.println(st.length());// returns the length(integer value)
        System.out.println(st.charAt(3)); //returns character at the given index in string
        sc.close();
    }
}
