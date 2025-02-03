import java.util.*;

class solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {   
        int mL = nums1.length + nums2.length;
        int[] mA = new int[mL];
        System.arraycopy(nums1, 0, mA, 0, nums1.length);
        System.arraycopy(nums2, 0, mA, nums1.length, nums2.length);
        Arrays.sort(mA);
        int mid = mL/2;
        if (mL%2==0)
        {
            double mean = (mA[mid]+mA[mid-1])/2.0;
            return mean;
        }
        else 
        {
           double mean = mA[mid];
            return mean;
        }
    }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[a];
            for(int i = 0; i<arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }
            int[] brr = new int[b];
            for(int j = 0;j<brr.length;j++)
            {
                brr[j]= sc.nextInt();
            }
            double m = findMedianSortedArrays(arr,brr);
            System.out.println(m);
            sc.close();
        }
}