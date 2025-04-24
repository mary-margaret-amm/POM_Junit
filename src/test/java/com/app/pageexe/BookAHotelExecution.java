package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.BookAHotelLocator;

public class BookAHotelExecution extends SelectHotelExecution{

	public static void firstName() {
		BaseClass.sendKeys(new BookAHotelLocator().firstName(), excelRead_reuse(16,2));
	}
	public static void lastName() {
		BaseClass.sendKeys(new BookAHotelLocator().lastName(), excelRead_reuse(17,2));
	}
	public static void billingAddress() {
		BaseClass.sendKeys(new BookAHotelLocator().billingAddress(), excelRead_reuse(18,2));
	}
	public static void creditCardNumber() {
		BaseClass.sendKeys(new BookAHotelLocator().creditCardNumber(), excelRead_reuse(19,2));
	}
	public static void creditCardType() {
		BaseClass.sendKeys(new BookAHotelLocator().creditCardType(), excelRead_reuse(20,2));
	}
	public static void expiryMonth() {
		BaseClass.sendKeys(new BookAHotelLocator().expiryMonth(), excelRead_reuse(22,2));
	}
	public static void expiryYear() {
		BaseClass.sendKeys(new BookAHotelLocator().expiryYear(), excelRead_reuse(23,2));
	}
	public static void cvvNumber() {
		BaseClass.sendKeys(new BookAHotelLocator().cvvNumber(), excelRead_reuse(24,2));
	}
	public static void booknow() {
		BaseClass.click(new BookAHotelLocator().bookNowBtn());
	}
	
	public static void waitTime_10() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getAttribute() {
		return new BookAHotelLocator().orderNo().getAttribute("value");
	}
	public static void excelWrite() {
		BaseClass.excelWrite(BookAHotelExecution.getAttribute(), 2, 0);
	}
	
	
	
	
	
	
	
}
