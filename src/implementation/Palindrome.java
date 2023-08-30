package implementation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {

    static Scanner readin = new Scanner(System.in);

    /**
     * Principal method that works with the recursive method
     */
    public static void isPalindrome() {

        String string = dataInput();
        int left = 0;
        int right = string.length() - 1;

        String result = isPalindrome(string, left, right);
        System.out.println(result);
    }

    /**
     * Keyboard data entry
     *
     * @return normalized string
     */
    private static String dataInput() {

        System.out.print("Word or phrase: ");
        String txt = readin.nextLine();

        while (!validate(txt)) {
            System.out.println("No numbers or special characters allowed.\nMinimum and maximum characters: 2/50");
            System.out.print("Word or phrase: ");
            txt = readin.nextLine();
        }

        txt = txt.toLowerCase().trim().replace(" ", "");

        return txt;
    }

    /**
     * Validate entered string
     *
     * @param string (text to validate)
     * @return true if it meets the requirements
     */
    private static boolean validate(String string) {

        Pattern pattern = Pattern.compile("^[a-zA-Z ]{2,50}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    /**
     * Recursive method to check palindrome
     *
     * @param string (text to verify)
     * @param left (left part of the text)
     * @param right (right part of the text)
     * @return if its palindrome or not
     */
    private static String isPalindrome(String string, int left, int right) {

        String result;

        if (right < left) {
            result = "It's palindrome!";
        } else {

            char currentLeft = string.charAt(left);
            char currentRight = string.charAt(right);

            if (currentLeft != currentRight) {
                result = "It's not a palindrome!";
            } else {
                return isPalindrome(string, left + 1, right - 1);
            }
        }

        return result;
    }

}
