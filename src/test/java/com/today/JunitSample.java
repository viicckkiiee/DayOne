package com.today;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitSample {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adactinhotelapp.com/");
	}
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
	@Before
	public void takeScreenShot() throws IOException {
		File f = new File("C:\\Users\\Dell\\Pictures\\Saved Pictures\\pic5.png");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, f);
	}
	@After
	public void takeScreenShot2() throws IOException {
		File f = new File("C:\\Users\\Dell\\Pictures\\Saved Pictures\\pic6.png");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, f);
	}
	@Test
	public void login() {
		driver.findElement(By.id("username")).sendKeys("viicckkiiee");
		driver.findElement(By.id("password")).sendKeys("433NO3");
		driver.findElement(By.id("login")).click();
	}
	

}
