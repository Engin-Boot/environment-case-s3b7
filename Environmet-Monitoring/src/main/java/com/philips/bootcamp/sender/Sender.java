package com.philips.bootcamp.sender;

import java.io.IOException;
import java.util.List;


/**
 * Sender
 *
 */
public class Sender {
    public static void main( String[] args )
    {
        List<String []> environmentReadings = null;
		try {
			environmentReadings = CSVFileReader.readValuesFromCSVFileToList(FileFetcher.readCSVFileNameFromProperties());
		} catch (IOException e) {
			e.printStackTrace();
        }
		ConsoleWriter.writeReadingsToConsole(environmentReadings);
    }
}
