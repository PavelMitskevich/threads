package com.mitskevich.threads.reader;

import com.mitskevich.threads.exception.PortException;
import com.mitskevich.threads.util.PathUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class CustomDataReader {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String DATA_FILE_NAME = "data.properties";

    public List<String> readDataFromTxt() throws PortException {
        List<String> shipsData = null;

        String fileName = PathUtil.getResourcePath(DATA_FILE_NAME);

        if (fileName != null) {
            try (Stream<String> stringStream = Files.lines(Path.of(fileName))) {
                shipsData = stringStream.toList();
            } catch (IOException e) {
                LOGGER.error("file does not read {} ", fileName, e);
            }
        }
        return shipsData;
    }
}
