package com.dsa.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){

        // base condition
        if (n == 1){
            return 1;
        } else {
            // 5 * 4 * 3 * 2 * 1
            return n * fact(n-1);
        }

    }
}
