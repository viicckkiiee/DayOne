package com.sample;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import com.pages.BookingConfirmPage;
import com.pages.BookingPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelsPage;
import com.pages.SelectHotelPage;
import com.today.LibGlobal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends LibGlobal{
	
	String file = "C:\\Users\\Dell\\eclipse-workspace\\dayone\\Excel\\Sample.xlsx";
	
	@BeforeClass
	private void launchBrowser() {
		getDriver();
		implicitWait(Duration.ofSeconds(10));
		loadUrl("https://www.adactinhotelapp.com/");
	}
	

	@AfterClass
	private void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	@Test(priority=0)
	private void login() throws IOException {
		LoginPage loginpage = new LoginPage();
		loginpage.login(getdata(file, "Adactin", 1, 0), getdata(file, "Adactin", 1, 1));
	}
	
	@Test(priority=1)
	private void searchHotel() throws IOException {
		SearchHotelsPage searchHotel = new SearchHotelsPage();
		searchHotel.searchHotels(getdata(file, "Adactin", 1, 2), getdata(file, "Adactin", 1, 3), getdata(file, "Adactin", 1, 4), getdata(file, "Adactin", 1, 5), getdata(file, "Adactin", 1, 6), getdata(file, "Adactin", 1, 7), getdata(file, "Adactin", 1, 8), getdata(file, "Adactin", 1, 9));
	}
	
	@Test(priority=2)
	private void selectHotel() {
		SelectHotelPage selectHotel = new SelectHotelPage();
		selectHotel.selectHotel();
	}
	
	@Test(priority=3)
	private void bookingHotel() throws IOException {
		BookingPage book = new BookingPage();
		book.bookHotel(getdata(file, "Adactin", 1, 10), getdata(file, "Adactin", 1, 11), getdata(file, "Adactin", 1, 12), getdata(file, "Adactin", 1, 13), getdata(file, "Adactin", 1, 14), getdata(file, "Adactin", 1, 15), getdata(file, "Adactin", 1, 16), getdata(file, "Adactin", 1, 17));
	}
	
	@Test(priority=4)
	private void bookingConfirm() {
		BookingConfirmPage confirm = new BookingConfirmPage();
		confirm.confirmationId();
	}
	
	@Test(priority=5)
	private void cancel() throws AWTException {
		CancelBookingPage cancel = new CancelBookingPage();
		cancel.cancelOrder();
	}
	
	
	
	
	
	
	
	
//	@Parameters({"username","password","location","hotels","roomType","no of rooms","adult","child","Date In","Date Out","First Name","last Name","address","cc no","type","month","year","cvv"})
//	private void sample(String s,String s1, String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17) throws IOException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.findElement(By.id("username")).sendKeys(s);
//		driver.findElement(By.id("password")).sendKeys(s1);
//		driver.findElement(By.id("login")).click();
//		driver.findElement(By.id("location")).sendKeys(s2);
//		driver.findElement(By.id("hotels")).sendKeys(s3);
//		driver.findElement(By.id("room_type")).sendKeys(s4);
//		driver.findElement(By.id("room_nos")).sendKeys(s5);
//		driver.findElement(By.id("datepick_in")).sendKeys(s8);
//		driver.findElement(By.id("datepick_out")).sendKeys(s9);
//		driver.findElement(By.id("adult_room")).sendKeys(s6);
//		driver.findElement(By.id("child_room")).sendKeys(s7);
//		driver.findElement(By.id("Submit")).click();
//		driver.findElement(By.name("radiobutton_0")).click();
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("first_name")).sendKeys(s10);
//		driver.findElement(By.id("last_name")).sendKeys(s11);
//		driver.findElement(By.id("address")).sendKeys(s12);
//		driver.findElement(By.id("cc_num")).sendKeys(s13);
//		driver.findElement(By.id("cc_type")).sendKeys(s14);
//		driver.findElement(By.id("cc_exp_month")).sendKeys(s15);
//		driver.findElement(By.id("cc_exp_year")).sendKeys(s16);
//		driver.findElement(By.id("cc_cvv")).sendKeys(s17);
//		driver.findElement(By.id("book_now")).click();
//		String attribute = driver.findElement(By.id("order_no")).getAttribute("value");
//		
//		String filePath = "C:\\Users\\Dell\\eclipse-workspace\\dayone\\Excel\\Sample.xlsx";
//		LibGlobal.insertValue(filePath, "Data", 5, 5, attribute);
	
	

}
