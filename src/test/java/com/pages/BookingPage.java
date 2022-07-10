package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.today.LibGlobal;

public class BookingPage extends LibGlobal{
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstNname;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccExpYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	
	
	
	public WebElement getFirstNname() {
		return firstNname;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}
	public WebElement getCcExpYear() {
		return ccExpYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return book;
	}
	
	
	public void bookHotel(String fName,String lName,String address,String ccNum,String ccType,String expMonth,String expYear,String cvv) {
		
		send(getFirstNname(), fName);
		send(getLastName(), lName);
		send(getAddress(), address);
		send(getCcNum(), ccNum);
		selectByText(getCcType(), ccType);
		selectByText(getCcExpMonth(), expMonth);
		selectByText(getCcExpYear(), expYear);
		send(getCvv(), cvv);
		click(getBookNow());
	}

}
