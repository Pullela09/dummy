package com.cg.SunlightAddCust;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil {
	
	private static WebDriver driver = null;
	public static WebDriver driverInitialize(String driverName) {
		
		if ("chrome".equalsIgnoreCase(driverName)) {
			System.setProperty("webdriver.chrome.driver", "Drivers//chromeDriver.exe");
			driver = new ChromeDriver();
			

		} else if ("firefox".equalsIgnoreCase(driverName)) {
			System.setProperty("webdriver.firefox.driver", "Drivers//geckodriver.exe");
			driver = new FirefoxDriver();

		} else if ("ie".equalsIgnoreCase(driverName)) {
			System.setProperty("webdriver.ie.driver", "Drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		 driver.manage().window().maximize();
		return driver;
	}

	public static void closeDriver(WebDriver driver) {
		driver.quit();
	}


}
