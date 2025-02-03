public class AtoD {
    public static void main(String[] args) {
        // int l = 4; 
        // char ch = 'D';
        // for (int i = 0; i < l; i++) 
        // {
        //     for (char j = 'A'; j <= ch; j++) 
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // } 
        int n = 5;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
        int m = 3;
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print((char)(j+97)+" ");
            }
            System.out.println();
        }
    }   
}