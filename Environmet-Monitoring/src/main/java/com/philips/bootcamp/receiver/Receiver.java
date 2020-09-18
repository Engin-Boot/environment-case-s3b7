package com.philips.bootcamp.receiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Receiver
 *
 */
public class Receiver {
    public static void main( String[] args )throws IOException
    {
        String GetTheInputFromConsole;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Fetching Temperature and Humidity from sensing Device");
        while((GetTheInputFromConsole=br.readLine())!=null){
           
            String[] parts=GetTheInputFromConsole.split(" ");
            if(parts.length>=2){
                int temperatureSensedFromDevice=Integer.parseInt(parts[0]);
                int humiditySensedFromDevice=Integer.parseInt(parts[1]);
                System.out.println("Temperature is "+temperatureSensedFromDevice+"  Humidity is "+humiditySensedFromDevice);
                boolean TemperatureInRange=RangeChecker.checkIfTheTemperatureDoesNotViolates(temperatureSensedFromDevice);
               // System.out.println(TemperatureInRange);
                boolean HumidityinRange=RangeChecker.checkIfTheHumidityDoesNotViolates(humiditySensedFromDevice);
                //System.out.println(HumidityinRange);
                CheckIfAllDataUnderRequiredLimit.displayStatus(TemperatureInRange, HumidityinRange);
                //System.out.println("Hello");
            }
            else{
                System.out.println("Ignoring the Case");
            }
        }
        br.close();
    }
}
