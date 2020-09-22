package com.philips.bootcamp;


import static org.junit.Assert.assertEquals;

import java.io.File;

import java.io.IOException;

import com.philips.bootcamp.receiver.RangeChecker;

import org.junit.Assert;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ViolationOfLimits 
{
    @Test
    public void TemperatureWarningLimitsCrossedThenAssertFalse(){
        int Temp=78;
       
        boolean current=RangeChecker.checkIfTheTemperatureDoesNotViolatesWarningLevels(Temp);
        boolean expctd=true;
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
