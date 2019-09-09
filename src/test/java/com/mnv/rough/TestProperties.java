package com.mnv.rough;

import java.io.FileInputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws Exception {
		
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		System.out.println(config.getProperty("browser"));
		
		Properties or = new Properties();
	    fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
	    or.load(fis);
		
		
		System.out.println(or.getProperty("bml_login"));
	}

}
