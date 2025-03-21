package com.dsa.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        //  0       1         1       2
       //  n-2  +  n-1        n
        int result = fibo(4);
        System.out.println(result);
    }

    static int fibo(int n){

        // base condition
        if (n < 2){
            return n;
        }

        // recursion formula
        return fibo(n-1) + fibo(n-2);
    }
}
