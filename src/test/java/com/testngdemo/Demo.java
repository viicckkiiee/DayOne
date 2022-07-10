package com.testngdemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.today.LibGlobal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends LibGlobal{

	String f = "C:\\Users\\Dell\\eclipse-workspace\\dayone\\Excel\\Sample.xlsx";

	@Test(dataProvider="data")
	private void testCase(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9, String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17,String s18) throws IOException {
		
		getDriver();
		loadUrl("https://www.adactinhotelapp.com/");

		WebElement findElementById = findElementById("username");
		send(findElementById, s1);
		
		WebElement password = findElementById("password");
		send(password, s2);

		WebElement login = findElementById("login");
		click(login);


		WebElement location = findElementById("location");
		selectByText(location, s3);

		WebElement hotel = findElementById("hotels");
		selectByText(hotel, s4);

		WebElement roomType = findElementById("room_type");
		selectByText(roomType, s5);

		WebElement roomNo = findElementById("room_nos");
		selectByText(roomNo, s6);

		WebElement inDate = findElementById("datepick_in");
		send(inDate, s7);

		WebElement outDate = findElementById("datepick_out");
		send(outDate, s8);

		WebElement adult = findElementById("adult_room");
		selectByText(adult, s9);

		WebElement child = findElementById("child_room");
		selectByText(child, s10);

		WebElement btnSearch = findElementById("Submit");
		click(btnSearch);

		WebElement radioButton = findElementByName("radiobutton_0");
		click(radioButton);

		WebElement continueButton = findElementById("continue");
		click(continueButton);

		WebElement firstName = findElementById("first_name");
		send(firstName, s11);

		WebElement lastName = findElementById("last_name");
		send(lastName, s12);

		WebElement address = findElementById("address");
		send(address, s13);

		WebElement ccNum = findElementById("cc_num");
		send(ccNum, s14);

		WebElement ccType = findElementById("cc_type");
		selectByText(ccType, s15);

		WebElement ccMonth = findElementById("cc_exp_month");
		selectByText(ccMonth, s16);

		WebElement ccYear = findElementById("cc_exp_year");
		selectByValue(ccYear, s17);

		WebElement cvv = findElementById("cc_cvv");
		send(cvv, s18);

		WebElement book = findElementById("book_now");
		click(book);

	}

	@DataProvider(name="data")
	private Object[][] getData() throws IOException {

		Object[][] data = new Object[1][18];


		data[0][0] =	getdata(f, "Data", 1, 0);
		data[0][1] =	getdata(f, "Data", 1, 1);
		data[0][2] =	getdata(f, "Data", 1, 5);
		data[0][3] =	getdata(f, "Data", 1, 6);
		data[0][4] =	getdata(f, "Data", 1, 7);
		data[0][5] =	getdata(f, "Data", 1, 8);
		data[0][6] =	getdata(f, "Data", 1, 11);
		data[0][7] =	getdata(f, "Data", 1, 12);
		data[0][8] =	getdata(f, "Data", 1, 9);
		data[0][9] =	getdata(f, "Data", 1, 10);
		data[0][10] =	getdata(f, "Data", 1, 13);
		data[0][11] =	getdata(f, "Data", 1, 14);
		data[0][12] =	getdata(f, "Data", 1, 15);
		data[0][13] =	getdata(f, "Data", 1, 16);
		data[0][14] =	getdata(f, "Data", 1, 17);
		data[0][15] =	getdata(f, "Data", 1, 18);
		data[0][16] =	getdata(f, "Data", 1, 19);
		data[0][17] =	getdata(f, "Data", 1, 20);

				return data;

	}


}
