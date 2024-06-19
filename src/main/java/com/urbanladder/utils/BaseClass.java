package com.urbanladder.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	private static BaseClass helperClass;

	private static WebDriver driver; 
	public final static int TIMEOUT = 30;

	private BaseClass() {
	driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}      

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;              
	}

	public static void setUpDriver() {

		if (helperClass==null) {

			helperClass = new BaseClass();
		}
	}
	
	public static WebDriverWait getWait(long timeDelay) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeDelay));
	}
	
	public static Actions getHandler() {
		return new Actions(driver);
	}
	public static String getUrl() {
		return driver.getCurrentUrl();
	}

	public static void tearDown() {

		if(driver!=null) {
			driver.close();
			driver.quit();
		}

		helperClass = null;
	}
	
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void log(Scenario scenario, String data) {
		scenario.attach(data, "text/plain", "data");
	}
	//property file 
	public Properties propfile() throws IOException {
		
			FileReader file = new FileReader("./resources/config.properties");
			Properties p = new Properties();
			p.load(file);
			return p;
		
	}
	
	public static void takeScreenshot(String scName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String filePath = System.getProperty("user.dir")+"\\screenshots\\"+scName+".png";
		File trg = new File(filePath);
		FileUtils.copyFile(src, trg);
	}
}