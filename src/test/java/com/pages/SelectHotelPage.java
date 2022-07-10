package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.today.LibGlobal;

public class SelectHotelPage extends LibGlobal{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(id="continue")
	private WebElement continueButton;
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public void selectHotel() {
		click(getRadioButton());
		click(getContinueButton());
		
	}

}
