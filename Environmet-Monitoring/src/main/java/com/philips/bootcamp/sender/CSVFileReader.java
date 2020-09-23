package com.philips.bootcamp.sender;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader { //TODO: implement FileReader as a interface

    public static List<String []> readCSVToList(String csvFileName) throws IOException { // advantages for static block?
		List<String []>  temperatureAndHumidityReadings = new ArrayList<String []>();
        
        int numberOfRowsToSkip = 1; // TODO: move to a config file
        BufferedReader csvBufferedReader = new BufferedReader(new FileReader(csvFileName));
        
        for(int i = 0; i< numberOfRowsToSkip; i++){
            csvBufferedReader.readLine(); // this will read the first line
        }
        temperatureAndHumidityReadings = getReadingsFromBufferReaderAsListOfStrings(csvBufferedReader);

		csvBufferedReader.close();
		return temperatureAndHumidityReadings;
    }
    
    public static List<String []> getReadingsFromBufferReaderAsListOfStrings(BufferedReader buffer) throws IOException{

        String individualRow = "";
		List<String []>  readingList = new ArrayList<String []>();

        while((individualRow = buffer.readLine()) != null) { // TODO: move to a new function for better testing

			String[] rowEntries = individualRow.split(",");
			if(rowEntries.length > 1){
				readingList.add(rowEntries);
            }
        }
        return readingList;
    }
}

//List([136,96], [55,23], [], []...)