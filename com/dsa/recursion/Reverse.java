package com.dsa.recursion;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(palindrome(121));
        revCheat(1234);
        System.out.println(sum);
    }

    static int sum =0;
    // First method with using sum
    static void revCheat(int n){

        if (n == 0)
            return;

        sum = sum * 10 + (n % 10);
        revCheat(n/10);
    }

    static boolean palindrome(int n){
        return n == rev(n);
    }

    // Second method using helper function
    static int rev(int n){

        // to get the how many digits
        int digit = (int) (Math.log10(n)) + 1;

        return helper(n,digit);
    }

    private static int helper(int n, int digit) {

        if (n%10 == n)
            return n;

        int rem = n % 10;

        //       3
        // 4 * 10 + helper (123, 3)

        // 4000 + helper (123, 3)
        return rem * (int) (Math.pow(10, digit-1)) + helper(n/10, digit -1);
    }



}

