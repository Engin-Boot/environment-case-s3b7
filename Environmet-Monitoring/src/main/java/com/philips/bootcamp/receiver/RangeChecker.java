package com.philips.bootcamp.receiver;

public class RangeChecker {


public static boolean checkIfTheTemperatureDoesNotViolates(int temperatureSensedFromDevice) {
    if(temperatureSensedFromDevice>37 || temperatureSensedFromDevice<4){
        ConsoleAlertTheMessage.DisplayMessage("Temperature::"+temperatureSensedFromDevice+"  Warning ");
        return false;
    }
    if(temperatureSensedFromDevice>40 || temperatureSensedFromDevice<0){
        ConsoleAlertTheMessage.DisplayMessage("Temperature "+temperatureSensedFromDevice+" Error ");
        return false;
    }
    return true;
}

public static boolean checkIfTheHumidityDoesNotViolates(int humiditySensedFromDevice) {
    if(humiditySensedFromDevice>70 && humiditySensedFromDevice<90){
        ConsoleAlertTheMessage.DisplayMessage("Humidity "+humiditySensedFromDevice+" Warning ");
    return false;
}
    if(humiditySensedFromDevice>90){
        ConsoleAlertTheMessage.DisplayMessage("Humidity "+humiditySensedFromDevice+" Error ");
        return false;
    }
    return true;
}


}
