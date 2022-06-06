package com.abnamro.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
	
	private static WebDriver driver;
	
	static {
		chromeDriver();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	private static void chromeDriver() {

		File webDriverPath = new File(System.getProperty("user.dir") + "/webdriver");
		WebDriverManager.chromedriver().version("2.44").targetPath(webDriverPath.getAbsolutePath()).forceCache()
				.setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Runtime.getRuntime().addShutdownHook(new Thread() {
	            @Override
	            public void run() {
	                driver.quit();
	            }
	        });
	}

}
