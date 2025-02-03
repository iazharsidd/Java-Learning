import java.util.*;

class solution3 {
    public static int maxArea(int[] height) {
        int maxWater = 0, lp = 0, rp = height.length - 1;
        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int wd = rp - lp;
            int cW = ht * wd;
            maxWater = Math.max(maxWater, cW);
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxArea(arr));
        sc.close();
    }
}