public class PalindromeString 
{
    public static void main(String[] args)
    {
        String st = "121";
        int l = st.length();
        String s = "";
        for (int i = l-1; i >= 0; i--) 
        {
            char ch = st.charAt(i);
            s = s+ch;
        }   
        if (s.equals(st)) 
        {
            System.out.println(s+" is Equal to "+st);
        }
        else
        {
            System.out.println(s+" is not Equal to "+st);
        }
    }
}