package com.example.myproject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="setting")
public class Settings {
	
	private String test;
	
	public void setTest(String test) {
		this.test = test;
	}

	public String getTest() {
		return test;
	}

}
