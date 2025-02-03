import java.util.Scanner;

public class WayTooLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int i = 0;
        while (i <= q) {
            String st = sc.nextLine();
            int l = st.length();
            if (l > 10) {
                char c = st.charAt(0);
                char ch = st.charAt(l - 1);
                int k = l - 2;
                System.out.println(c + "" + k + "" + ch);
            } else {
                System.out.println(st);
            }
            i++;
        }
        sc.close();
    }
}