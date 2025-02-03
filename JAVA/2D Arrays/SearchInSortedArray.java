import java.util.Scanner;

public class SearchInSortedArray {
    static boolean search(int[][] arr, int key) {
        int r = 0, c = arr[0].length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == key) {
                System.out.println("Key found at (" + r + "," + c + ")");
                return true;
            } else if (key < arr[r][c]) {
                c--;
            } else
                r++;
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int r, c, key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        r = sc.nextInt();
        System.out.print("Enter the number of coloumns : ");
        c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the key : ");
        key = sc.nextInt();
        search(arr, key);
        sc.close();
    }
}