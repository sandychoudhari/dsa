package com.dsa.recursion;

public class Nto1 {
    public static void main(String[] args) {
        printNum(5);

    }

    public static void printNum(int n){

        if (n == 0)
            return;
        printNum(n-1);
        System.out.println(n);

    }
}
