package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLocator extends LoginPageLocator {

	public SearchHotelLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="location")
	private WebElement location;
	@FindBy (id="hotels")
	private WebElement hotels;
	@FindBy (id="room_type")
	private  WebElement room_type;
	//private WebElement roomType;
	@FindBy (id = "room_nos")
	private WebElement room_nos;
	@FindBy (id="datepick_in")
	private WebElement datepick_in;
	@FindBy (id = "datepick_out")
	private WebElement datepick_out;
	@FindBy (id= "adult_room")
	private WebElement adult_room;
	@FindBy (id= "child_room")
	private WebElement child_room;
	@FindBy (id="Submit")
	private WebElement Submit;
	
	public WebElement getlocation() {
		return location;
	}
	
	public WebElement getHotel() {
		return hotels;
	}
	
	public WebElement getRoomType() {
		return room_type;
	}
	
	public WebElement getRoomNos() {
		return room_nos;
	}
	public WebElement getDatepick_In() {
		return datepick_in;
	}
	public WebElement getDatepick_Out() {
		return datepick_out;
	}
	public WebElement getAdultRoom() {
		return adult_room;
	}
	public WebElement getChildRoom() {
		return child_room;
	}
	public WebElement getSearchBtn() {
		return Submit;
	}












}
