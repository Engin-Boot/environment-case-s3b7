package com.philips.bootcamp.sender;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ConsoleWriter {
    public static void writeReadingsToConsole(List<String[]> readingsToBePrintedOnConsole) {
        for (String[] reading : readingsToBePrintedOnConsole) {
            
            delayExecutionBySeconds(2);
            
			for(String element: reading){
                System.out.print(element + ' ');
            }
            System.out.println();
		}
    }
    
    public static void delayExecutionBySeconds(int seconds){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
