package OOPS;
public class Stringreverse
{

    public static void main(String[] args) 
    {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) 
    {
        char[] reversedCharArray = new char[str.length()];
        int start = 0;
        int end = str.length() - 1;

        while (end >= 0) {
            reversedCharArray[start] = str.charAt(end);
            start++;
            end--;
        }

       return new String(reversedCharArray);
    }
}
