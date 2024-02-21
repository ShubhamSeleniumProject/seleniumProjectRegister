package com.tyss.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	
	public ElectronicsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Electronics']")
	private WebElement msg_electronics;
	
	@FindBy(partialLinkText = "Camera, photo")
	private WebElement camera_button;

	public WebElement getMsg_electronics() {
		return msg_electronics;
	}

	public WebElement getCamera_button() {
		return camera_button;
	}
	
	
	

}
