package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FindIndexAl {
    public static ArrayList<Integer> findIndices(int[] arr, int idx, int x) {
        // Base case: If the index goes beyond the array length, return an empty ArrayList.
        if (idx >= arr.length) {
            return new ArrayList<Integer>();
        }

        // Recursive case:
        ArrayList<Integer> result = findIndices(arr, idx + 1, x); // Recursively search in the rest of the array.

        // Check if the current element is equal to x and add its index to the result.
        if (arr[idx] == x) {
            result.add(idx);
        }

        return result;
    }

    public static void main(String[] args) {
        int a, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter x = ");
        x = sc.nextInt();

        ArrayList<Integer> indices = findIndices(arr, 0, x);

        if (indices.isEmpty()) {
            System.out.println("Element " + x + " not found in the array.");
        } else {
            System.out.println("Indices of element " + x + " in the array: " + indices);
        }
        sc.close();
    }
}
