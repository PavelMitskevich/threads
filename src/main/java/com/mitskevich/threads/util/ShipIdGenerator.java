package com.mitskevich.threads.util;

public class ShipIdGenerator {
    public static int counter;

    private ShipIdGenerator() {
    }

    public static int generate() {
        return ++counter;
    }
}
