package com.philips.bootcamp.sender;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.IOException;
import java.util.List;


public class SenderTest {

    // @Test
    // public void CheckIfAllValuesSentBySenderAreNumbers() throws IOException{

    //     String CSVFileName = FileFetcher.readCSVFileNameFromProperties();
    //     // CSVFileName = ".\\Environmet-Monitoring\\" + CSVFileName.substring(2);
    //     System.out.println(CSVFileName);
    //     List<String []> readings = CSVFileReader.readValuesFromCSVFileToList(CSVFileName);
    //     boolean isAnyValueNotNumeric = false;
       
    //     for (String[] reading : readings) {
	// 		for(String element: reading){
    //             try {
    //                 Double.parseDouble(element);

    //             } catch (Exception e) {
    //                 isAnyValueNotNumeric = true;
    //             }
    //         }
    //     }

    //     boolean expctd = false;
    //     assertEquals(isAnyValueNotNumeric, expctd);
    // }

    // @Test
    // public void CheckIfAllValuesSentBySenderArePositive() throws IOException{

    //     String CSVFileName = FileFetcher.readCSVFileNameFromProperties();
    //     List<String []> readings = CSVFileReader.readValuesFromCSVFileToList(CSVFileName);
    //     boolean isAnyReadingNegative = false;
       
    //     for (String[] reading : readings) {
	// 		for(String element: reading){
    //             double parsedReading = Double.parseDouble(element);
    //             if(parsedReading < 0){
    //                 isAnyReadingNegative = true;
    //                 break;
    //             }
    //         }
    //     }

    //     boolean expctd = false;
    //     assertEquals(isAnyReadingNegative, expctd);
    // }
}
