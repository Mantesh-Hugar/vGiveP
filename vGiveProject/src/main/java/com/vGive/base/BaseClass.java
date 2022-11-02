package com.vGive.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.vGive.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

	@BeforeSuite
	public void loadConfig() {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e)

		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void launchApp() throws InterruptedException {

		String browserName = prop.getProperty("browser");
		if (browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browserName.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.contains("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	

	@AfterSuite
	public void afterSuite() {
		ExtentManager.endReport();
	}

}
