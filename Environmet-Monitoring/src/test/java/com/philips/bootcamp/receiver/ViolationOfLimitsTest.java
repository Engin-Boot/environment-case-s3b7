package com.philips.bootcamp.receiver;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ViolationOfLimitsTest 
{
    @Test
    public void TemperatureWarningLimitsCrossedThenAssertFalse(){
        int Temp=78;
       
        boolean current=RangeChecker.checkIfTheTemperatureDoesNotViolatesWarningLevels(Temp);
        boolean expctd=false;
        assertEquals(current, expctd);
    }
    @Test
    public void TemperatureErrorLimitsCrossedThenAssertFalse(){
        int Temp=51;
       
        boolean current=RangeChecker.checkIfTheTemperatureDoesNotViolatesErrorLevels(Temp);
        boolean expctd=false;
        assertEquals(current, expctd);
    }
    @Test
    public void HumidityWarningLimitCrossedThenAssetFalse(){
        int Hum=78;
       
        boolean current=RangeChecker.checkIfTheHumidityDoesNotViolatesWarningLevel(Hum);
        boolean expctd = false;
        assertEquals(current, expctd);
    }

    @Test
    public void HumidityErrorLimitCrossedThenAssetFalse() {
        int Hum = 98;

        boolean current = RangeChecker.checkIfTheHumidityDoesNotViolatesErrorLevel(Hum);
        boolean expctd=false;
        assertEquals(current, expctd);
    }
   
}
