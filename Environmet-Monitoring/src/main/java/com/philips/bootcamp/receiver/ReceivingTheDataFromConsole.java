package com.philips.bootcamp.receiver;

public class ReceivingTheDataFromConsole {

	public static void checkingReadingsOfDevice(int humiditySensedFromDevice, int temperatureSensedFromDevice) {
        System.out.println("Temperature is "+temperatureSensedFromDevice+"  Humidity is "+humiditySensedFromDevice);
        boolean TemperatureUnderWarningLimit=RangeChecker.checkIfTheTemperatureDoesNotViolatesWarningLevels(
                temperatureSensedFromDevice);
       boolean HumidityUnderWarningLimit=RangeChecker.checkIfTheHumidityDoesNotViolatesWarningLevel(humiditySensedFromDevice);
       boolean TemperatureUnderErrorLimit=RangeChecker.checkIfTheTemperatureDoesNotViolatesErrorLevels(temperatureSensedFromDevice);
       boolean HumidityUnderErrorLimit=RangeChecker.checkIfTheHumidityDoesNotViolatesErrorLevel(humiditySensedFromDevice);
        boolean TemperatureInRange = TemperatureUnderWarningLimit && TemperatureUnderErrorLimit;
        boolean HumidityinRange = HumidityUnderWarningLimit && HumidityUnderErrorLimit;
        CheckIfAllDataUnderRequiredLimit.displayStatus(TemperatureInRange, HumidityinRange);
        
	}

}
