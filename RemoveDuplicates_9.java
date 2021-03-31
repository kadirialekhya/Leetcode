package org.TopJavaInterviewQuestions;

import java.util.*;

public class RemoveDuplicates_9 {
    public static void main(String[] args) {
        List<Integer>primes=new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(2);
        primes.add(4);
        primes.add(2);
        System.out.println("list before"+primes);
        Set<Integer>duplicatesWithoutPrimes=new LinkedHashSet<>(primes);
        primes.clear();
        primes.addAll(duplicatesWithoutPrimes);
        System.out.println("after set"+primes);



    }
}
