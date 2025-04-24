package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelLocator extends SearchHotelLocator{
	public SelectHotelLocator(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@type='radio']")
	private WebElement radioBtn;
	
	@FindBy (id="continue")
	private WebElement continueBtn;
		
	public WebElement getradioBtn() {
		return radioBtn;
	}
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}

}
