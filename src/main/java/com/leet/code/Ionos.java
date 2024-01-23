package com.leet.code;

public class Ionos {

    public static String primeFactorization(int number) {
        if (number <= 1) {
            return String.valueOf(number);
        }
        String result = "";
        int num = number - 1;
        for (int i = num; i > 1; i--) {
            if (number % i == 0) {
                result += primeFactorization(i) + " ";
                result += primeFactorization((number / i)) + " ";
                break;
            }
        }
        if (result.isEmpty())
            result = String.valueOf(number);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(primeFactorization(2));
        System.out.println(primeFactorization(3));
        System.out.println(primeFactorization(5));
        System.out.println(primeFactorization(7));
        System.out.println(primeFactorization(8));
        System.out.println(primeFactorization(9));
        System.out.println(primeFactorization(6930));
    }
}
