package com.sqa.ujian5.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sqa.ujian5.driver.DriverSingleton;

public class Buying {

	private WebDriver driver;
	
	public Buying() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignIn;
	
	@FindBy(css = "#email")
	private WebElement txtboxEmail;
	
	@FindBy(css = "#passwd")
	private WebElement txtboxPassword;
	
	@FindBy(css = "#SubmitLogin")
	private WebElement btnLogin;
	
	public void menuSignIn() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
	}
	
	public void login(String email, String password) {
		
		txtboxEmail.sendKeys(email);
		txtboxPassword.sendKeys(password);
		
		btnLogin.click();
	}
	
	
}
