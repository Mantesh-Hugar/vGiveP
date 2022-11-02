package com.vGive.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

	@Test(priority = 1)

	public void vGive() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://vgive-qa.herokuapp.com/#");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='grey-outline_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userPass']")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	

	}

	@Test(priority = 2)
	public void myaccount() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@class='d-flex headerDropDown']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@Test(priority = 3)
	public void mousehover1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://vgive-qa.herokuapp.com/#");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Support']"));
		act.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Manteshhugar98@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userPass']")).sendKeys("Mantesh@724");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='defaultDropdownContact']")).click();
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Education']"));
		act.moveToElement(element ).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Add fundraiser title [20 words]']")).sendKeys("Mantesh Hugar");
	}

}
