package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class LoginPageLocator extends BaseClass{
	
	public LoginPageLocator(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username")
	private WebElement username;
	@FindBy (id = "password")
	private WebElement password;
	@FindBy (id = "login")
	private WebElement login;
	
	public WebElement getUserName() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginBtn() {
		return login;
	}

}

  
//		public static WebElement user() {
//			return driver.findElement(By.id("username"));
//		}
//		
//		public static WebElement pass() {
//			return driver.findElement(By.id("password"));
//		}
//		
//		public static WebElement loginBtn() {
//			return driver.findElement(By.id("login"));
//		}
//		----------------------------------------------------------
//		public static WebElement hLocation() {
//			return driver.findElement(By.id("location"));
//		}
//		
//		public static WebElement hotels() {
//			return driver.findElement(By.id("hotels"));
//		}
//		public static WebElement roomType() {
//			return driver.findElement(By.id("room_type"));
//		}
//		public static WebElement numberOfRooms() {
//			return driver.findElement(By.id("room_nos"));
//		}
//		public static WebElement checkInDate() {
//			return driver.findElement(By.id("datepick_in"));
//		}
//		public static WebElement checkOutDate() {
//			return driver.findElement(By.id("datepick_out"));
//		}
//		public static WebElement adultsPerRoom() {
//			return driver.findElement(By.id("adult_room"));
//		}
//		public static WebElement childrenPerRoom() {
//			return driver.findElement(By.id("child_room"));
//		}
//		public static WebElement searchButton() {
//			return driver.findElement(By.id("Submit"));
//		}
//--------------------------------------------------------------
//		public static WebElement radioBtn() {
//			return driver.findElement(By.xpath("//input[@type='radio']"));
//				
//		}
//		public static WebElement continueBtn() {
//			return driver.findElement(By.id("continue"));
//		}
//--------------------------------------------------------------------
//		public static WebElement firstName() {
//			return driver.findElement(By.id("first_name"));
//		}
//		public static WebElement lastName() {
//			return driver.findElement(By.id("last_name"));
//		}
//		public static WebElement billingAddress() {
//			return driver.findElement(By.id("address"));
//		}
//		public static WebElement creditCardNumber() {
//			return driver.findElement(By.id("cc_num"));
//		}
//		public static WebElement creditCardType() {
//			return driver.findElement(By.id("cc_type"));
//		}
//		public static WebElement expiryMonth() {
//			return driver.findElement(By.id("cc_exp_month"));
//		}
//		public static WebElement expiryYear() {
//			return driver.findElement(By.id("cc_exp_year"));
//		}
//		public static WebElement cvvNumber() {
//			return driver.findElement(By.id("cc_cvv"));
//		}
//		public static WebElement bookNowBtn() {
//			return driver.findElement(By.id("book_now"));
//		}
//		public static WebElement orderID() {
//			return driver.findElement(By.xpath("//input[@id='order_no']"));
//		}
//


	

  

  

