package org.TopJavaInterviewQuestions;

public class ReverseString_8 {
    public static String reverse(String input)
    {
        if(input==null)
        {
            return null;
        }
        else
        {
            char[] ch=input.toCharArray();
            StringBuilder sb=new StringBuilder();
            for(int i=input.length()-1;i>=0;i++)
            {
sb.append(i);
            }
String output=sb.toString();

        }
        return reverse(input);
    }
}
