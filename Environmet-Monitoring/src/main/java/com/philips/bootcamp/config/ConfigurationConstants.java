package com.philips.bootcamp.config;

public class ConfigurationConstants {

    public enum CSVReaderConstants {
        GET();
        public final int NUMER_OF_LINES_TO_SKIP_WHILE_READING_BUFFER = 1;
        public int getNumberOfLinesToSkip() {
            return NUMER_OF_LINES_TO_SKIP_WHILE_READING_BUFFER;
        }
    }

}
