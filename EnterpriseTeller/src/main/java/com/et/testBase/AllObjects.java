package com.et.testBase;

import com.et.helper.WaitHelper;
import com.et.pageObjects.Login;
import com.et.utilities.Keywords;

public interface AllObjects {

	static Login loginPage = new Login(TestBase.driver);
	static Keywords keyword = new Keywords(TestBase.driver);
	static WaitHelper wait = new WaitHelper(TestBase.driver);
	
}
