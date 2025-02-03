public class ArraySquare 
{
    public static int[] SquareArr(int[] arr)
    {
        int n = arr.length;
        int[] brr = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            brr[i] = arr[i] * arr[i];
        }
        int temp = 0;
        for (int i = 0; i < brr.length-1; i++) 
        {
            if (brr[i]>brr[i+1]) 
            {
                temp = brr[i+1];
                brr[i+1] = brr[i];
                brr[i] = temp;
            }
        }
        return brr;
    }
    public static void main(String[] args) 
    {
        int[] arr = {-1,-2,3,4,5,-6};
        int[] brr = SquareArr(arr);
        for (int i = 0; i < brr.length; i++) 
        {
            System.out.print(brr[i]+" ");
        }
    }
}
