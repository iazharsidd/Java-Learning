package Sorting;
import java.util.*;
public class BucketSort 
{
    static void bucketSort(float[] arr)
    {
        int n = arr.length;
        ArrayList<Float>[] bucket = new ArrayList[n];
        for (int i = 0; i < n; i++) 
        {
            bucket[i] = new ArrayList<Float>();
        }
        // add elements to the bucket
        for (int i = 0; i < n; i++) 
        {
            int bi = (int)arr[i]*n;
            bucket[bi].add(arr[i]);
        }
        //Sorting Bucket
        for (int i = 0; i < bucket.length; i++) 
        {
            Collections.sort(bucket[i]);
        }
        // merging buckets
        int idx = 0;
        for (int i = 0; i < bucket.length; i++) 
        {
            ArrayList<Float> cb = bucket[i];
            for (int j = 0; j < cb.size(); j++) 
            {
                arr[idx++] = cb.get(j);
            }
        }
    }
    public static void main(String[] args) 
    {
        float[] arr = {0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);
        for (float f : arr) 
        {
            System.out.print(f+" ");
        }
    }
    
}
