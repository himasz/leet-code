package com.leet.code.data.structure.examples;

import java.util.ArrayList;
import java.util.List;

public class EfficientPrimeNumbers {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        int n = 100000; // Change this to the desired limit
        List<Integer> primes = generatePrimes(n);

        System.out.println("Prime numbers up to " + n + ":");
        System.out.println(primes);
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
    }

    private static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n >= 2) {
            primes.add(2);
        }

        boolean[] isPrime = new boolean[(n - 1) / 2];
        for (int i = 1; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                int current = 2 * i + 1;
                primes.add(current);

                // Mark multiples of the current prime as not prime
                for (long j = (long) current * current; j <= n; j += current * 2) {
                    if (j % 2 == 1) {
                        isPrime[(int) (j / 2) - 1] = true;
                    }
                }
            }
        }

        return primes;
    }
}
