package com.philips.bootcamp.receiver;

public class CheckIfAllDataUnderRequiredLimit {
public static void displayStatus(boolean temp,boolean hum,int temperatureReading,int humidityReading){
    if((temp&&hum)==true){
        String s="All Sensed Data is Ok";
        ConsoleAlertTheMessage.DisplayFinalMessage("All Sensed Data is Ok");
        LogFileForWritingDataToMAP.EntriesInMap(temperatureReading,humidityReading,s);

    }
    else{
        String s="Check The Device and Maintain It Properly";
    ConsoleAlertTheMessage.DisplayFinalMessage("Check The Device and Maintain It Properly");
    LogFileForWritingDataToMAP.EntriesInMap(temperatureReading, humidityReading,s);

    }
}

}
