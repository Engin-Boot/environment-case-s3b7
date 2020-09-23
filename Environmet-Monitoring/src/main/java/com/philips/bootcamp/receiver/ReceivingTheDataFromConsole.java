package com.philips.bootcamp.receiver;

public class ReceivingTheDataFromConsole {

public static void checkingReadingsOfDevice(int humiditySensedFromDevice, int temperatureSensedFromDevice) {

System.out.println("Temperature is ::"+temperatureSensedFromDevice+"  Humidity is ::"+humiditySensedFromDevice);
boolean TemperatureInRange=RangeChecker.checkIfTheTemperatureDoesNotViolatesWarningLevels(temperatureSensedFromDevice) && 
RangeChecker.checkIfTheTemperatureDoesNotViolatesErrorLevels(temperatureSensedFromDevice);
boolean HumidityinRange =RangeChecker.checkIfTheHumidityDoesNotViolatesWarningLevel(humiditySensedFromDevice) && 
RangeChecker.checkIfTheHumidityDoesNotViolatesErrorLevel(humiditySensedFromDevice);
CheckIfAllDataUnderRequiredLimit.displayStatus(TemperatureInRange, HumidityinRange,temperatureSensedFromDevice,humiditySensedFromDevice);

}

}
