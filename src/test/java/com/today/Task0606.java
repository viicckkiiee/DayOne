package com.today;

import java.io.IOException;
import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Task0606 extends LibGlobal {
	
	String f = "C:\\Users\\Dell\\eclipse-workspace\\dayone\\Excel\\Sample.xlsx";
	@BeforeClass
	public static void launchBrowser() {
			getDriver();
			loadUrl("https://www.adactinhotelapp.com/");
	}
	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void loginValidation() throws IOException {
		WebElement username = findElementById("username");
		String getdata = getdata(f, "Data", 1, 0);
		send(username, getdata);
		
		WebElement password = findElementById("password");
		String getdata2 = getdata(f, "Data", 1, 1);
		send(password, getdata2);
		
		WebElement login = findElementById("login");
		click(login);
		
			String attribute = findElementById("username_show").getAttribute("value");
			boolean b = attribute.contains("Hello viicckkiiee!");
			Assert.assertTrue("Verify Login", b);
		
		WebElement location = findElementById("location");
		String locationData = getdata(f, "Data", 1, 5);
		selectByText(location, locationData);

		WebElement hotel = findElementById("hotels");
		String hotelName = getdata(f, "Data", 1, 6);
		selectByText(hotel, hotelName);

		WebElement roomType = findElementById("room_type");
		String room = getdata(f, "Data", 1, 7);
		selectByText(roomType, room);

		WebElement roomNo = findElementById("room_nos");
		String roomNos = getdata(f, "Data", 1, 8);
		selectByText(roomNo, roomNos);

		WebElement inDate = findElementById("datepick_in");
		String dateIn = getdata(f, "Data", 1, 11);
		send(inDate, dateIn);

		WebElement outDate = findElementById("datepick_out");
		String dateOut = getdata(f, "Data", 1, 12);
		send(outDate, dateOut);

		WebElement adult = findElementById("adult_room");
		String adultdata = getdata(f, "Data", 1, 9);
		selectByText(adult, adultdata);

		WebElement child = findElementById("child_room");
		String childRoom = getdata(f, "Data", 1, 10);
		selectByText(child, childRoom);

		WebElement btnSearch = findElementById("Submit");
		click(btnSearch);
		
			String text = findElementClassname("login_title").getText();
			boolean contains = text.contains("Select Hotel");
			Assert.assertTrue("Verify Book Now", contains);
			
		WebElement radioButton = findElementByName("radiobutton_0");
		click(radioButton);

		WebElement continueButton = findElementById("continue");
		click(continueButton);
	
			String text2 = findElementByXpath("(//td[@class='login_title'])[2]").getText();
			boolean contains2 = text2.contains("Book A Hotel");
			Assert.assertTrue("Verify Select Hotel", contains2);
		
		WebElement firstName = findElementById("first_name");
		String nameFirst = getdata(f, "Data", 1, 13);
		send(firstName, nameFirst);
		
		WebElement lastName = findElementById("last_name");
		String nameLast = getdata(f, "Data", 1, 14);
		send(lastName, nameLast);

		WebElement address = findElementById("address");
		String addres = getdata(f, "Data", 1, 15);
		send(address, addres);

		WebElement ccNum = findElementById("cc_num");
		String ccNo = getdata(f, "Data", 1, 16);
		send(ccNum, ccNo);

		WebElement ccType = findElementById("cc_type");
		String ccTyp = getdata(f, "Data", 1, 17);
		selectByText(ccType, ccTyp);

		WebElement ccMonth = findElementById("cc_exp_month");
		String month = getdata(f, "Data", 1, 18);
		selectByText(ccMonth, month);

		WebElement ccYear = findElementById("cc_exp_year");
		String year = getdata(f, "Data", 1, 19);
		selectByValue(ccYear, year);

		WebElement cvv = findElementById("cc_cvv");
		String cVV = getdata(f, "Data", 1, 20);
		send(cvv, cVV);

		WebElement book = findElementById("book_now");
		click(book);
		
		implicitWait(Duration.ofSeconds(10));
			
				String text3 = findElementByXpath("//td[text()='Booking Confirmation ']").getText();
				Assert.assertEquals("Verify", "Booking Confirmation", text3);
				
		WebElement orderId = findElementById("order_no");
		String orderValue = getAttribute(orderId);
		insertValue(f, "Data", 5, 0, orderValue);
		insertValue(f, "Data", 4, 0, "Order Id");		
	}
}
