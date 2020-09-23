package com.philips.bootcamp.sender;

import java.util.ResourceBundle;

public class FileFetcher {
    public static ResourceBundle rb = ResourceBundle.getBundle("filepath");
	public static String readCSVFileNameFromProperties() {
		return rb.getString("filename");
	}
}
