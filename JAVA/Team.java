import java.util.Scanner;

public class Team 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int n = 3;
        int i = 0;
        int nq = 0;
        while ( i < q ) 
        {
            int c = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) 
            {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) 
            {
                if (arr[j] == 1) 
                {
                    c++;
                }
            }
            if (c >= 2) 
            {
                nq++;
            }
            i++;
        }
        System.out.println(nq);
        sc.close();
    }
    
}
