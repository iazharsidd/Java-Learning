import java.util.Scanner;

public class spiralprintsq
 {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        int minr = 0, maxr = n - 1, minc = 0, maxc = n - 1, tne = n * n, count = 1;
        while (tne >= count)
        {
            for (int j = minc; j <= maxc && count <= tne; j++) 
            {
                arr[minr][j] = count++;
            }
            minr++;
           for (int i = minr; i <= maxr && count <= tne; i++) 
           {
            arr[i][maxc]=count++;
           }
           maxc--;
           for (int j = maxc; j >= minc && count <= tne; j--)
           {
            arr[maxr][j] = count++;
           }
           maxr--;
           for (int i = maxr; i >= minr && count <= tne; i--) 
           {
            arr[i][minc]=count++;
           }
           minc++;
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}