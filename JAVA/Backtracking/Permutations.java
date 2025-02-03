package Backtracking;

import java.util.*;

public class Permutations 
{
    public static void printp(String s, String st,List<String> l) 
    {
        if (s.equals("")) 
        {
            l.add(st);
            return;
        }
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            String rem = left + right;
            printp(rem, st+ch,l);
        }
    }
    public static void main(String[] args) {
        
        List<String> l = new ArrayList<>(); 
        String s = "abc";
        printp(s,"",l);
        for (int i = 0; i < l.size(); i++) 
        {
            System.out.println(l.get(i));
        }
    } 
}