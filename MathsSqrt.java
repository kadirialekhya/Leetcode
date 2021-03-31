package org.TopJavaInterviewQuestions;

import java.util.Scanner;

public class MathsSqrt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        double square=scanner.nextDouble();
        double squareRoot=Math.sqrt(square);
        System.out.println("square root"+squareRoot);
    }
}
