package com.philips.bootcamp.sender;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    public static List<String []> readCSVToList(String csvFileName) throws IOException {
		List<String []>  readingList = new ArrayList<String []>();
        String individualRow = "";
        int numberOfRowsToSkip = 1;
        BufferedReader csvBufferedReader = new BufferedReader(new FileReader(csvFileName));
        
        for(int i = 0; i< numberOfRowsToSkip; i++){
            csvBufferedReader.readLine(); // this will read the first line
        }
		while((individualRow = csvBufferedReader.readLine()) != null) {

			String[] rowEntries = individualRow.split(",");
			if(rowEntries.length > 1){
				readingList.add(rowEntries);
            }
        }
        
		csvBufferedReader.close();
		return readingList;
	}
}
