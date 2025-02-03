public class PalindromeSubstrings {
    // Function to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to find and print all palindrome substrings
    public static void findPalindromeSubstrings(String str) {
        int n = str.length();
        System.out.println("Palindrome substrings are:");

        // Loop through the string and consider all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring)) {
                    System.out.println(substring);
                }
            }
        }
    }

    public static void main(String[] args) {
        String input = "abacdfgdcaba";
        findPalindromeSubstrings(input);
    }
}