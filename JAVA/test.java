public class test {
     public static void subsequence(String str, int idx ,String nS)
     {
        if (idx == str.length()) 
        {
            System.out.println(nS);
            return;
        }
        char currChar=str.charAt(idx);// 0 1
        subsequence(str, idx+1, nS+currChar);
        subsequence(str, idx+1, nS);
     }  
     public static void main(String[] args) 
    {
        String str = "abc";
        subsequence(str, 0, "");
    }
}