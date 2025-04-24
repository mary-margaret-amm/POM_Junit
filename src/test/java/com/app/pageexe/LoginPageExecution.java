package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.LoginPageLocator;

public class LoginPageExecution extends LoginPageLocator{
	
	public static void username() {
		BaseClass.sendKeys(new LoginPageLocator().getUserName(), property_Reuse("username"));
	}
	
	public static void password() {
		BaseClass.sendKeys(new LoginPageLocator().getPassword(), property_Reuse("password"));
	}
	
	public static void loginBtn() {
		BaseClass.click(new LoginPageLocator().getLoginBtn());
	}
	

}
