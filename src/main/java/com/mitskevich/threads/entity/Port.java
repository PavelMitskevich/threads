package com.mitskevich.threads.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class Port {
    private static final Logger LOGGER = LogManager.getLogger();
    public static Port instance;
    private static final AtomicBoolean isInitialized = new AtomicBoolean();
    private static final CountDownLatch initialisingLatch = new CountDownLatch(1);

}
