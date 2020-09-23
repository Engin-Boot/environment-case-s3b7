package com.philips.bootcamp.sender;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ConsoleWriter {
    public static void writeReadingsToConsole(List<String[]> readings) {
        for (String[] reading : readings) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
			for(String element: reading){
                System.out.print(element + ' ');
            }
            System.out.println();
		}
	}
}
