package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.today.LibGlobal;

public class BookingConfirmPage extends LibGlobal {
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	static String attribute;
	
	@FindBy(id="order_no")
	private static WebElement orderId;
	@FindBy(id="my_itinerary")
	private static WebElement itinerary;

	public static WebElement getItinerary() {
		return itinerary;
	}

	public static WebElement getOrderId() {
		return orderId;
	}
	
	public static void confirmationId() {
		
		attribute = getAttribute(getOrderId());
		click(getItinerary());
		
	}

}
