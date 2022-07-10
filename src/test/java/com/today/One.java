package com.today;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class One {
	public static void main(String[] args) throws IOException, InterruptedException {

		
		
		LibGlobal libGlobal = new LibGlobal();
		
		
		libGlobal.getDriver();
		String url = "https://www.adactinhotelapp.com/";
		libGlobal.loadUrl(url);
		WebElement userNameBox = libGlobal.findElementById("username");
		String file = "C:\\Users\\Dell\\eclipse-workspace\\dayone\\Excel\\Sample.xlsx";
		String username = libGlobal.getdata(file, "Data", 1, 0);
		libGlobal.send(userNameBox, username);
		WebElement passwordBox = libGlobal.findElementById("password");
		String passWord = libGlobal.getdata(file, "Data", 1, 1);
		libGlobal.send(passwordBox, passWord);
		WebElement btnLogin = libGlobal.findElementById("login");
		libGlobal.click(btnLogin);

		WebElement location = libGlobal.findElementById("location");
		String locationData = libGlobal.getdata(file, "Data", 1, 5);
		libGlobal.selectByText(location, locationData);

		WebElement hotel = libGlobal.findElementById("hotels");
		String hotelName = libGlobal.getdata(file, "Data", 1, 6);
		libGlobal.selectByText(hotel, hotelName);

		WebElement roomType = libGlobal.findElementById("room_type");
		String room = libGlobal.getdata(file, "Data", 1, 7);
		libGlobal.selectByText(roomType, room);

		WebElement roomNo = libGlobal.findElementById("room_nos");
		String roomNos = libGlobal.getdata(file, "Data", 1, 8);
		libGlobal.selectByText(roomNo, roomNos);

		WebElement inDate = libGlobal.findElementById("datepick_in");
		String dateIn = libGlobal.getdata(file, "Data", 1, 11);
		libGlobal.send(inDate, dateIn);

		WebElement outDate = libGlobal.findElementById("datepick_out");
		String dateOut = libGlobal.getdata(file, "Data", 1, 12);
		libGlobal.send(outDate, dateOut);

		WebElement adult = libGlobal.findElementById("adult_room");
		String adultdata = libGlobal.getdata(file, "Data", 1, 9);
		libGlobal.selectByText(adult, adultdata);

		WebElement child = libGlobal.findElementById("child_room");
		String childRoom = libGlobal.getdata(file, "Data", 1, 10);
		libGlobal.selectByText(child, childRoom);

		WebElement btnSearch = libGlobal.findElementById("Submit");
		libGlobal.click(btnSearch);

		WebElement radioButton = libGlobal.findElementByName("radiobutton_0");
		libGlobal.click(radioButton);

		WebElement continueButton = libGlobal.findElementById("continue");
		libGlobal.click(continueButton);

		WebElement firstName = libGlobal.findElementById("first_name");
		String nameFirst = libGlobal.getdata(file, "Data", 1, 13);
		libGlobal.send(firstName, nameFirst);

		WebElement lastName = libGlobal.findElementById("last_name");
		String nameLast = libGlobal.getdata(file, "Data", 1, 14);
		libGlobal.send(lastName, nameLast);

		WebElement address = libGlobal.findElementById("address");
		String addres = libGlobal.getdata(file, "Data", 1, 15);
		libGlobal.send(address, addres);

		WebElement ccNum = libGlobal.findElementById("cc_num");
		String ccNo = libGlobal.getdata(file, "Data", 1, 16);
		libGlobal.send(ccNum, ccNo);

		WebElement ccType = libGlobal.findElementById("cc_type");
		String ccTyp = libGlobal.getdata(file, "Data", 1, 17);
		libGlobal.selectByText(ccType, ccTyp);

		WebElement ccMonth = libGlobal.findElementById("cc_exp_month");
		String month = libGlobal.getdata(file, "Data", 1, 18);
		libGlobal.selectByText(ccMonth, month);

		WebElement ccYear = libGlobal.findElementById("cc_exp_year");
		String year = libGlobal.getdata(file, "Data", 1, 19);
		libGlobal.selectByValue(ccYear, year);

		WebElement cvv = libGlobal.findElementById("cc_cvv");
		String cVV = libGlobal.getdata(file, "Data", 1, 20);
		libGlobal.send(cvv, cVV);

		WebElement book = libGlobal.findElementById("book_now");
		libGlobal.click(book);

		WebElement orderId = libGlobal.findElementById("order_no");
		String orderValue = libGlobal.getAttribute(orderId);
		libGlobal.insertValue(file, "Data", 4, 4, orderValue);
		System.out.println(orderValue);
		

	}

}
