package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {

	
		FileReader Fr = new FileReader(System.getProperty("user.dir") +"\\src\\main\\resources\\configfile\\config.properties"); 
		Properties p = new Properties(); // object of properties class
		p.load(Fr);

		System.out.println(p.getProperty("browser")); // use to print browser
		System.out.println(p.getProperty("testurl")); // use to print url
	}

}
