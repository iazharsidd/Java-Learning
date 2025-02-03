import java.util.Scanner;

public class spiralprint 
{
    public static void main(String[] args)
    {
        int r,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of couloumns : ");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0,maxr= r-1,minc=0,maxc = c-1,tne=r*c,count=0;
        while (tne>count) 
        {
            for (int j = minc; j <= maxc && count < tne ; j++)
            {
                System.out.print(arr[minr][j]+" ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && count < tne; i++) 
            {
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
            for (int j = maxc; j >= minc && count < tne; j--) 
            {
                System.out.print(arr[maxr][j]+" ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < tne; i--) 
            {
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
        }
        sc.close();
    }
}