package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.SearchHotelLocator;

public class SearchHotelExecution extends LoginPageExecution {
	
	public static void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void location() {
		BaseClass.sendKeys(new SearchHotelLocator().getlocation(), excelRead_reuse(5, 2));
	}
	public static void hotels() {
		BaseClass.sendKeys(new SearchHotelLocator().getHotel(), excelRead_reuse(6, 3));
	}
	public static void roomType() {
		BaseClass.sendKeys(new SearchHotelLocator().getRoomType(), excelRead_reuse(7, 3));
	}
	public static void noOfRooms() {
		BaseClass.sendKeys(new SearchHotelLocator().getRoomNos(), excelRead_reuse(8, 3));
	}
	public static void checkInDate() {
		BaseClass.sendKeys(new SearchHotelLocator().getDatepick_In(), excelRead_reuse(9, 2));
	}
	public static void checkOutDate() {
		BaseClass.sendKeys(new SearchHotelLocator().getDatepick_Out(), excelRead_reuse(10, 2));
	}
	public static void adultsPerRoom() {
		BaseClass.sendKeys(new SearchHotelLocator().getAdultRoom(), excelRead_reuse(11, 3));
	}
	public static void childrenPerRoom() {
		BaseClass.sendKeys(new SearchHotelLocator().getChildRoom(), excelRead_reuse(12, 3));
	}
	public static void searchBtnClick() {
		BaseClass.click(new SearchHotelLocator().getSearchBtn());
	}
	
	

}
