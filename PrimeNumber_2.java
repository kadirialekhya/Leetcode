package org.TopJavaInterviewQuestions;

public class PrimeNumber_2 {
    public static boolean IsPrime(int n)
    {
int sqrt=(int) Math.sqrt(n)+1;
for(int i=2;i<=sqrt;i++)
{
    if(n%i==0)
    {
        return false;
    }
}
return true;
    }

    public static void main(String[] args) {
        PrimeNumber_2.IsPrime(4);
    }
}
