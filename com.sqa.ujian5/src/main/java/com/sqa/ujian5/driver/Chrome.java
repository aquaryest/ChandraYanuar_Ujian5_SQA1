package com.sqa.ujian5.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements DriverStrategy {

	@Override
	public WebDriver setStrategy() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Web Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
