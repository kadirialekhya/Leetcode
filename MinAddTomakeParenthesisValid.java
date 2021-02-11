package org.VISA;

import java.util.Stack;

public class MinAddTomakeParenthesisValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)=='(')
            {
                stack.add(S.charAt(i));
            }
            if (S.charAt(i)==')'&& stack.isEmpty())
            {
                counter++;
                continue;
            }
            if (S.charAt(i)==')')
            {
                stack.pop();
            }
        }
        return counter+stack.size();
    }

    public static void main(String[] args) {
        MinAddTomakeParenthesisValid m=new MinAddTomakeParenthesisValid();
        System.out.println(m.minAddToMakeValid("())"));
    }
}