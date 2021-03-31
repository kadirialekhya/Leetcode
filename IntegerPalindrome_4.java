package org.TopJavaInterviewQuestions;

public class IntegerPalindrome_4 {
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int rev = 0;
        while (palindrome != 0) {
            int rem=palindrome%10;
            rev = rev * 10 + rem;
            palindrome=palindrome/10;
        }
        if(number==rev)
        {
            return true;
        }
        return false;
    }
}
