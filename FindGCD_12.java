package org.TopJavaInterviewQuestions;

import java.util.Scanner;

public class FindGCD_12 {
    public static int gcd(int num1,int num2)
    {
        if(num2==0)
        {
            return 1;
        }
        return gcd(num2,num1%num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
        System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + gcd(number1, number2));

    }
}
