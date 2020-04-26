package com.softserve.edu.greencity.ui.pages.cabinet;

import org.openqa.selenium.WebDriver;

import com.softserve.edu.greencity.ui.pages.common.SmallHeightPart;

public class MyCabinetPage extends SmallHeightPart {

	public MyCabinetPage(WebDriver driver) {
		super(driver);
		initElements();
	}

	private void initElements() {
		// init elements
	}

	// Page Object
	public LoginPage getLoginPage() {
	    return new LoginPage(driver);
	}
	
	public RegisterPage getRegisterPage() {
	    return new RegisterPage(driver);
	}

	// Functional

	// Business Logic
}