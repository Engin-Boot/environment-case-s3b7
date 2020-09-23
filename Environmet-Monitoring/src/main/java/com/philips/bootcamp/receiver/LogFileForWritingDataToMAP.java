package com.philips.bootcamp.receiver;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LogFileForWritingDataToMAP {
    static int i=1;
   static Map<Integer,GetDataToFeedToLog>log=new HashMap<>();
   
  
	public static void EntriesInMap(int temperatureReading, int humidityReading,String msg) {
   
    GetDataToFeedToLog r=new GetDataToFeedToLog(temperatureReading, humidityReading, msg);
    log.put(i++,r);
    log.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
     }
    
   
  

