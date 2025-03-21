package com.dsa.recursion;

public class ProductSum {
    public static void main(String[] args) {
        System.out.println(multiply(1234));
    }

    static int multiply(int n){
        if (n%10 == n){
            return n;
        }

        return n % 10 * multiply(n/10);
    }
}
