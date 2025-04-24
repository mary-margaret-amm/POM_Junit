package com.app.exe;

import org.junit.Test;

import com.app.pageexe.BookAHotelExecution;

public class Execution extends BookAHotelExecution {
	
	@Test
	public void test() {
		username();
		password();
		loginBtn();
		waitTime();
		location();
		waitTime();
		hotels();
		waitTime();
		roomType();
		waitTime();
		noOfRooms();
		waitTime();
		checkInDate();
		waitTime();
		checkOutDate();
		waitTime();
		adultsPerRoom();
		waitTime();
		childrenPerRoom();
		waitTime();
		searchBtnClick();
		waitTime();
		radioBtn();
		waitTime();
		continueBtn();
		waitTime();
		firstName();
		waitTime();
		lastName();
		waitTime();
		billingAddress();
		waitTime();
		creditCardNumber();
		waitTime();
		creditCardType();
		waitTime();
		expiryMonth();
		waitTime();
		expiryYear();
		waitTime();
		cvvNumber();
		waitTime();
		booknow();
		waitTime_11s();
		excelWrite();
	}
}
