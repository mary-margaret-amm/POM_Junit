package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.SelectHotelLocator;

public class SelectHotelExecution extends SearchHotelExecution{
	public static void radioBtn() {
		BaseClass.click(new SelectHotelLocator().getradioBtn());
	}
	public static void continueBtn() {
		BaseClass.click(new SelectHotelLocator().getContinueBtn());
	}

}
