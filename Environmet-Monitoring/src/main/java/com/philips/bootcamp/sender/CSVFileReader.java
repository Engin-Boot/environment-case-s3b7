package com.philips.bootcamp.sender;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.philips.bootcamp.config.ConfigurationConstants.CSVReaderConstants;
public class CSVFileReader {

    public static List<String []> readCSVToList(String csvFileName) throws IOException {
		List<String []>  temperatureAndHumidityReadings = new ArrayList<String []>();
        
        BufferedReader csvBufferedReader = new BufferedReader(new FileReader(csvFileName));
        
        for(int i = 0; i< CSVReaderConstants.GET.NUMER_OF_LINES_TO_SKIP_WHILE_READING_BUFFER; i++){
            csvBufferedReader.readLine();
        }
        temperatureAndHumidityReadings = getReadingsFromBufferReaderAsListOfStrings(csvBufferedReader);

		csvBufferedReader.close();
		return temperatureAndHumidityReadings;
    }
    
    public static List<String []> getReadingsFromBufferReaderAsListOfStrings(BufferedReader buffer) throws IOException{

        String individualRow = "";
		List<String []>  readingList = new ArrayList<String []>();

        while((individualRow = buffer.readLine()) != null) {

			String[] rowEntries = individualRow.split(",");
			if(rowEntries.length > 1){
				readingList.add(rowEntries);
            }
        }
        return readingList;
    }
}