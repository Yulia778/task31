package com.metanit;

public class Method2 {
    public static void main(String[] args) {
        long m2 = System.currentTimeMillis();
        String x = "aaabbbccc";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            builder.append("!");
        }x = builder.toString();
        System.out.println(m2);
    }
    }
