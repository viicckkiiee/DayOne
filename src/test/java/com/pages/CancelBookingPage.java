package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.today.LibGlobal;

public class CancelBookingPage extends BookingConfirmPage {
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="order_id_text")
	private WebElement txtOrderId;
	
	@FindBy(name="search_hotel_id")
	private WebElement searchButton;
	
	@FindBy(xpath="//input[contains(@id,'btn')]")
	private WebElement cancelOrder;

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getCancelOrder() {
		return cancelOrder;
	}
	
	public void cancelOrder() throws AWTException {
		
		send(getTxtOrderId(), attribute);
		click(getSearchButton());
		click(getCancelOrder());
		pressEnter();
	}
	
	

}
