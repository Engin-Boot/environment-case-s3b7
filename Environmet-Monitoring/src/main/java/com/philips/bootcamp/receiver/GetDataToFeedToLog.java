package com.philips.bootcamp.receiver;

public class GetDataToFeedToLog {
    private int TempData;
    private int HumidityData;
    private String AlertMsg;

    public GetDataToFeedToLog(int tempData, int humidityData, String msg) {
        this.TempData = tempData;
        this.HumidityData = humidityData;
        this.AlertMsg = msg;
    }

    public int getTempData() {
        return TempData;
    }

    public void setTempData(int tempData) {
        TempData = tempData;
    }

    public int getHumidityData() {
        return HumidityData;
    }

    public void setHumidityData(int humidityData) {
        HumidityData = humidityData;
    }

    public String getAlertMsg() {
        return AlertMsg;
    }

    public void setAlertMsg(String alertMsg) {
        AlertMsg = alertMsg;
    }

    @Override
    public String toString() {
        
        return "Temperature::"+TempData+" Humidity is::"+HumidityData+"  "+AlertMsg;
    }
	
	
	
}
