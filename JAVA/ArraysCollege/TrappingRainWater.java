import java.util.Scanner;

public class TrappingRainWater 
{
    public static int rainWater(int arr[]) 
    {
        //calculating left maximum boundary 
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        //calculating right maximum boundary
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) 
        {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        int trapped = 0;
        int trap = 0;
        for (int i = 0; i < arr.length; i++) 
        {
             int waterLevel = Math.min(leftMax[i], rightMax[i]);
             trap = waterLevel - arr[i];
             System.out.print(trap+" ");
             trapped = trapped + trap;
        }
        return trapped;

    }

    public static void main(String[] args) 
    {
        int a;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
       int water = rainWater(arr);
       System.out.println();
       System.out.println("Total Trapped Water is : "+water);
        sc.close();
    }
}
