package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.today.LibGlobal;

public class SearchHotelsPage extends LibGlobal {
	
	public SearchHotelsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNos;
	@FindBy(id="datepick_in")
	private WebElement dateIn;
	@FindBy(id="datepick_out")
	private WebElement dateOut;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement searchButton;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public void searchHotels(String location,String hotels,String roomType,String roomNo,String inDate,String outDate,String adult,String child) {
		
		selectByText(getLocation(), location);
		selectByText(getHotels(), hotels);
		selectByText(getRoomType(), roomType);
		selectByText(getRoomNos(), roomNo);
		send(getDateIn(), inDate);
		send(getDateOut(), outDate);
		selectByText(getAdultRoom(), adult);
		selectByText(getChildRoom(), child);
		click(searchButton);
		
	}
	
	
}
