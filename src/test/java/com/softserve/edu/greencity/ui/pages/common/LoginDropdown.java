package com.softserve.edu.greencity.ui.pages.common;

import com.softserve.edu.greencity.ui.tools.LoginPart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDropdown extends LoginPart {

	private final String EMAIL_ID = "email";
	private final String PASSWORD_ID = "password";
	private final String LOGIN_BUTTON_XPATH = "//button[@type='submit' and @class='primary-global-button']";
	private final String GOOGLE_LOGIN_BUTTON_CLASS = "google-sign-in";
	private final String FORGOT_PASSWORD_LINK_CLASS = "forgot-password";
	private final String REGISTRATION_LINK_CLASS = "sign-up-link";


	private WebDriver driver;

	public LoginDropdown(WebDriver driver) {
		this.driver = driver;
		initElements();
	}

	private void initElements() {
		this.setEmailField(driver.findElement(By.id(EMAIL_ID)))
				.setPasswordField(driver.findElement(By.id(PASSWORD_ID)))
				.setLoginButton(driver.findElement(By.xpath(LOGIN_BUTTON_XPATH)))
				.setGoogleLoginButton(driver.findElement(By.className(GOOGLE_LOGIN_BUTTON_CLASS)))
				.setForgotPasswordLink(driver.findElement(By.className(FORGOT_PASSWORD_LINK_CLASS)))
				.setRegisterLink(driver.findElement(By.className(REGISTRATION_LINK_CLASS)));
	}

}
