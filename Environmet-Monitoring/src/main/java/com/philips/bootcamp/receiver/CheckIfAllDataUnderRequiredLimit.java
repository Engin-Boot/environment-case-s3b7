package com.philips.bootcamp.receiver;

public class CheckIfAllDataUnderRequiredLimit {
    public static void displayStatus(boolean temp,boolean hum){
        if((temp&&hum)==true){
            ConsoleAlertTheMessage.DisplayFinalMessage("All Sensed Data is Ok");
             //   System.out.println("All Sensed Data Ok");
        }
        else
        ConsoleAlertTheMessage.DisplayFinalMessage("Check The Device and Maintain It Properly");
        //System.out.println("Check the Device Properly");
    }
}
