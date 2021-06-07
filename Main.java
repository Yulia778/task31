package com.metanit;


public class Main {
    public static void main(String[] args) {
        long m1 = System.currentTimeMillis();
        String str = "aaabbbccc";
        for (int i = 0; i < 1000000; i++) {
            str += "!";
        }
        System.out.println(m1);}

    }
