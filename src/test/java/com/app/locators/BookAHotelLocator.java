package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelLocator extends SelectHotelLocator{

	public BookAHotelLocator(){
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "first_name")
	private WebElement firstName;
	@FindBy (id = "last_name")
	private WebElement lastName;
	@FindBy (id = "address")
	private WebElement billingAddress;
	@FindBy (id = "cc_num")
	private WebElement creditCardNumber;
	@FindBy (id = "cc_type")
	private WebElement creditCardType;
	@FindBy (id = "cc_exp_month")
	private WebElement expiryMonth;
	@FindBy (id = "cc_exp_year")
	private WebElement expiryYear;
	@FindBy (id = "cc_cvv")
	private WebElement cvvNumber;
	@FindBy (id = "book_now")
	private WebElement bookNowBtn;
	
	@FindBy (id = "order_no")
	private WebElement orderNo;
	
	public WebElement firstName() {
		return firstName;
	}
	public WebElement lastName() {
		return lastName;
	}
	public WebElement billingAddress() {
		return billingAddress;
	}
	public WebElement creditCardNumber() {
		return creditCardNumber;
	}
	public WebElement creditCardType() {
		return creditCardType;
	}
	public WebElement expiryMonth() {
		return expiryMonth;
	}
	public WebElement expiryYear() {
		return expiryYear;
	}
	public WebElement cvvNumber() {
		return cvvNumber;
	}
	public WebElement bookNowBtn() {
		return bookNowBtn;
	}
	public WebElement orderNo() {
		return orderNo;
	}
	
	
	
}
