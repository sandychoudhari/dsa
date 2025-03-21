package com.dsa.recursion;

// I/p 1234 = 1+2+3+4
//O/P  10
public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    static int sum(int n){
        if (n == 0){
            return 0;
        }

        return n % 10 + sum(n/10);
    }
}
