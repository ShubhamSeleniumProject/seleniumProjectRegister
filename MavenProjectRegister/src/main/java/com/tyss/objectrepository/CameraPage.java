package com.tyss.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CameraPage {
	public CameraPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//h1[text()='Camera, photo']")
	private WebElement camera_msg;
	
	@FindBy(id="products-orderby")
	private WebElement sort_products;

	public WebElement getCamera_msg() {
		return camera_msg;
	}

	public WebElement getSort_products() {
		return sort_products;
	}
	
	
	
	

}
