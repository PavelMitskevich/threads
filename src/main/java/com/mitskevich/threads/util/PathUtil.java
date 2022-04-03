package com.mitskevich.threads.util;

import com.mitskevich.threads.exception.PortException;

import java.net.URL;

public class PathUtil {
    public static String getResourcePath(String resourceName) throws PortException {
        final int pathStartPosition = 6;
        ClassLoader loader = PathUtil.class.getClassLoader();
        URL resource = loader.getResource(resourceName);
        if (resource == null) {
            throw new PortException("Resource " + resourceName + " is not found");
        }
        return resource.toString().substring(pathStartPosition);
    }
}
