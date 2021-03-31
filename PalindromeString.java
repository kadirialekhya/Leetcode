package org.TopJavaInterviewQuestions;

public class PalindromeString {
    public static boolean isPalindrome(String input)
    {
        if(input==null||input.length()==0)
        {
            return true;
        }
        char[] array=input.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=input.length()-1;i>=0;i++)
        {
            sb.append(array[i]);
        }
        String output=sb.toString();
        return input.equals(output);
    }
}
