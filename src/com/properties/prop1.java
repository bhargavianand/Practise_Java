package com.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class prop1 {
	
	public static void main(String[] args) throws IOException {
		/*FileReader fr = new FileReader("db.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));*/
	
		
		FileReader fr = new FileReader("db.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password","default value-123"));
		
		
	}
}
