public class zeroNone {
    public static void main(String[] args) {
        int n = 4;
        int a = 0;  
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if ((i+j)%2 == 0) a = 1;
                else a = 0;
                System.out.print(a);
            }
            System.out.println();            
        }
    }
}
