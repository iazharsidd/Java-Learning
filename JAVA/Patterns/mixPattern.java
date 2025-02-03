public class mixPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
            } else {
                for (int j2 = 1; j2 <= i; j2++) {
                    System.out.print(j2 + " ");
                }
            }
            System.out.println();
        }
    }
}
