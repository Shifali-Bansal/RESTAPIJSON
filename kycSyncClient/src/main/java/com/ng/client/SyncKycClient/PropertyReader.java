package com.ng.client.SyncKycClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	private static Properties prop = new Properties();
	
	private PropertyReader() {

		try {
			InputStream input = PropertyReader.class.getClassLoader()
					.getResourceAsStream("kycConfig.properties");
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		
		return prop.getProperty(key);
	}
	
	private static class SingletonHelper {
		private static final PropertyReader INSTANCE = new PropertyReader();
	}

	public static PropertyReader getInstance() {
		return SingletonHelper.INSTANCE;
	}
}