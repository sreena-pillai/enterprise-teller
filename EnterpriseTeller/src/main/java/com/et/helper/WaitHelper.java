package com.et.helper;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.et.testBase.TestBase;

public class WaitHelper extends TestBase {

Logger logger = LoggerHelper.getLogger(WaitHelper.class);
	
	public WaitHelper(WebDriver driver){
		TestBase.driver = driver;
	}
	
	public void WaitForElement(WebElement element,long timeOutInSeconds){
		logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("element is visible..");
	}
	
	public void implicitlyWait(long timeOutInSeconds) {
		TestBase.driver.manage().timeouts().implicitlyWait(timeOutInSeconds,TimeUnit.SECONDS);
	}

}
