package org.TopJavaInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters_11 {
    public static void printDuplicates(String word) {
        char[] ch = word.toCharArray();
        Map<Character, Integer> occurences = new HashMap<Character, Integer>();
        for (Character c : ch) {
            if (occurences.containsKey(c)) {
                occurences.put(c, occurences.get(c) + 1);
            } else {
                occurences.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = occurences.entrySet();
        System.out.println("List of duplicate characters in String " + word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        printDuplicates("programming");
        printDuplicates("java");
        printDuplicates("combination");

    }
}
