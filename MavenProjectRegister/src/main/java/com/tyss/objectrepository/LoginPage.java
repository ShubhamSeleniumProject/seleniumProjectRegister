package com.tyss.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="Email")
	private WebElement Email_text;
	
	@FindBy(id="Password")
	private WebElement pwd_text;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login_button;

	public WebElement getEmail_text() {
		return Email_text;
	}

	public WebElement getPwd_text() {
		return pwd_text;
	}

	public WebElement getLogin_button() {
		return login_button;
	}
	
	
	
	
}
