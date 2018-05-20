package com.Rules;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    private static AtomicInteger j = new AtomicInteger(0);
    public static void main(String[] args) {
        int i = 1;
        int k = j.get();
        System.out.println(k);
        System.out.println(j.compareAndSet(i,k));
        System.out.println(k);
    }
}
