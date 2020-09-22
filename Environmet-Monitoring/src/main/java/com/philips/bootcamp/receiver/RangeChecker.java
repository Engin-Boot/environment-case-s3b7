package com.philips.bootcamp.receiver;

public class RangeChecker {

public static boolean checkIfTheTemperatureDoesNotViolatesWarningLevels(int temperatureSensedFromDevice){
    if(temperatureSensedFromDevice>37 && temperatureSensedFromDevice<40){
        ConsoleAlertTheMessage.DisplayMessage("Temperature::"+temperatureSensedFromDevice+"  Warning ");
        return false;
    }
    
    if(temperatureSensedFromDevice<4){
        ConsoleAlertTheMessage.DisplayFinalMessage("Temperature::"+temperatureSensedFromDevice+"  Warning ");
    
    return false;
    }

    return true;
}
public static boolean checkIfTheTemperatureDoesNotViolatesErrorLevels(int temperatureSensedFromDevice) {
    if(temperatureSensedFromDevice>40){
        ConsoleAlertTheMessage.DisplayMessage("Temperature::"+temperatureSensedFromDevice+"  Error ");
        return false;
    }
    if(temperatureSensedFromDevice<0){
        ConsoleAlertTheMessage.DisplayMessage("Temperature "+temperatureSensedFromDevice+" Error ");
        return false;
    }
    return true;
}

public static boolean checkIfTheHumidityDoesNotViolatesWarningLevel(int humiditySensedFromDevice) {
    if(humiditySensedFromDevice>70 && humiditySensedFromDevice<90){
        ConsoleAlertTheMessage.DisplayMessage("Humidity "+humiditySensedFromDevice+" Warning ");
    return false;
}
  
    return true;
}

public static boolean checkIfTheHumidityDoesNotViolatesErrorLevel(int humiditySensedFromDevice) {
    if(humiditySensedFromDevice>90){
        ConsoleAlertTheMessage.DisplayMessage("Humidity "+humiditySensedFromDevice+" Error ");
        return false;
    }
    return true;
}


}
