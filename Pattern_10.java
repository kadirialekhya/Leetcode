package org.TopJavaInterviewQuestions;

public class Pattern_10 {
    public static void pattern()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.println(" ");
            }
            for(int k=0; k<=i ;k++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();
        pattern();

    }
}
