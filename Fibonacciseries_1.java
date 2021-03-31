package org.TopJavaInterviewQuestions;

public class Fibonacciseries_1 {
    public static int fibbonocci(int n)
    {
        if(n==1||n==2)
        {
            return 1;
        }
       return fibbonocci(n-1)+fibbonocci(n-2);

    }

    public static void main(String[] args) {
       Fibonacciseries_1.fibbonocci(5);

    }
}
