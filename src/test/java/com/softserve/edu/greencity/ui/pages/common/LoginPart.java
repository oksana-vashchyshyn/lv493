package com.softserve.edu.greencity.ui.pages.common;

import com.softserve.edu.greencity.ui.pages.cabinet.LoginComponent;
import org.openqa.selenium.WebElement;

public abstract class LoginPart {

    protected WebElement emailField;
    protected WebElement passwordField;
    protected WebElement signInButton;
    protected WebElement googleSigningButton;
    protected WebElement forgotPasswordLink;
    private WebElement singUpLink;

    public LoginPart inputEmail(String email) {
        this.getEmailField().sendKeys(email);
        return this;
    }

    public LoginPart inputPassword(String password) {
        this.getPasswordField().sendKeys(password);
        return this;
    }

    public LoginPart clickLoginButton() {
        this.getSignInButton().click();
        return this;
    }

    public LoginPart clickGoogleLoginButton() {
        this.getGoogleSigningButton().click();
        return this;
    }

    public abstract ForgotPasswordPart gotoForgotPassword();
ts

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getGoogleSigningButton() {
        return googleSigningButton;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public WebElement getSingUpLink() {
        return singUpLink;
    }

    public LoginPart setSingUpLink(WebElement singUpLink) {
        this.singUpLink = singUpLink;
        return this;
    }

    public LoginPart setEmailField(WebElement emailField) {
        this.emailField = emailField;
        return this;
    }

    public LoginPart setPasswordField(WebElement passwordField) {
        this.passwordField = passwordField;
        return this;
    }

    public LoginPart setSignInButton(WebElement signInButton) {
        this.signInButton = signInButton;
        return this;
    }

    public LoginPart setGoogleSignInButton(WebElement googleSigningButton) {
        this.googleSigningButton = googleSigningButton;
        return this;
    }

    public LoginPart setForgotPasswordLink(WebElement forgotPasswordLink) {
        this.forgotPasswordLink = forgotPasswordLink;
        return this;
    }


}

