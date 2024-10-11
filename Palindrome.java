package OOPS;
public class Palindrome {
    
    public static boolean isPalindrome(String str)
    {
        String normalizedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = normalizedStr.length() - 1;

        while (left < right) {
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right))
            {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";

        if (isPalindrome(testString)) {
            System.out.println("\"" + testString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testString + "\" is not a palindrome.");
        }
    }
}
