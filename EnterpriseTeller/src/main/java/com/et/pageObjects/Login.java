package com.et.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.et.helper.WaitHelper;
import com.et.testBase.TestBase;

public class Login extends TestBase {
	WaitHelper waitHelper;

	@FindBy(xpath="")
	public WebElement cashbox;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		
	}
	
	public void login() {
		keyword.enterText(cashbox, "");
	}

}
