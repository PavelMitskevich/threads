package com.mitskevich.threads.util;

public class PierIdGenerator {
    public static int counter;

    private PierIdGenerator() {
    }

    public static int generate() {
        return ++counter;
    }
}
