import java.util.Scanner;

public class AvengersTeamDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] powers = new int[n];

        for (int i = 0; i < n; i++) {
            powers[i] = scanner.nextInt();
        }

        long captainPower = 0;
        long ironManPower = 0;
        boolean captainTurn = true;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (captainTurn) {
                if (powers[left] >= powers[right]) {
                    captainPower += powers[left];
                    left++;
                } else {
                    captainPower += powers[right];
                    right--;
                }
            } else {
                if (powers[left] >= powers[right]) {
                    ironManPower += powers[left];
                    left++;
                } else {
                    ironManPower += powers[right];
                    right--;
                }
            }
            captainTurn = !captainTurn;
        }

        long difference = captainPower - ironManPower;
        System.out.println(Math.abs(difference));
        scanner.close();
    }
}