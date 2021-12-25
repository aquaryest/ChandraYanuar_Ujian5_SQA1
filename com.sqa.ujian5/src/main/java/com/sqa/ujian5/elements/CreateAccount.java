package com.sqa.ujian5.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sqa.ujian5.driver.DriverSingleton;

public class CreateAccount {

	private WebDriver driver;
	
	public CreateAccount( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignIn;
	
	@FindBy(css = "#email_create")
	private WebElement txtboxCreateEmail;
	
	@FindBy(css = "#SubmitCreate")
	private WebElement btnCreateAccount;
	
	@FindBy(css = "#id_gender1")
	private WebElement genderMale;
	
	@FindBy(css = "#id_gender2")
	private WebElement genderFemale;
	
	@FindBy(css = "#customer_firstname")
	private WebElement txtboxFirstName;
	
	@FindBy(css = "#customer_lastname")
	private WebElement txtboxLasttName;
	
	@FindBy(css = "#passwd")
	private WebElement txtboxPassword;
	
	@FindBy(css = "#days")
	private WebElement txtDays;
	
	@FindBy(css = "#months")
	private WebElement txtMonth;
	
	@FindBy(css = "#years")
	private WebElement txtYear;
	
	@FindBy(css = "#newsletter")
	private WebElement btnNews;
	
	@FindBy(css = "#optin")
	private WebElement btnOption;
	
	@FindBy(css = "#company")
	private WebElement txtboxCompany;
	
	@FindBy(css = "#address1")
	private WebElement txtboxAddress;
	
	@FindBy(css = "#address2")
	private WebElement txtboxAddress2;
	
	@FindBy(css = "#city")
	private WebElement txtboxCity;
	
	@FindBy(css = "#id_state")
	private WebElement State;
	
	@FindBy(css = "#id_country")
	private WebElement Country;
	
	@FindBy(css = "#postcode")
	private WebElement txtboxZip;
	
	@FindBy(css = "#other")
	private WebElement txtboxOther;
	
	@FindBy(css = "#phone")
	private WebElement txtboxHomePhone;
	
	@FindBy(css = "#phone_mobile")
	private WebElement txtboxMobile;
	
	@FindBy(css = "#alias")
	private WebElement txtboxAlias;
	
	@FindBy(css = "#submitAccount")
	private WebElement btnRegister;
	
	public void menuSignIn() {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
	}
	
	public void formCreateEmail(String email) {
		
		txtboxCreateEmail.sendKeys(email);
		btnCreateAccount.click();
		
	}
	
	public void setGender(int selection) {
		
		switch(selection) {
		case 1 :
			genderMale.click();
			break;
		case 2 :
			genderFemale.click();
			break;
		}
	}
	
	public void formRegister(String first, String last, String password) {
		
		txtboxFirstName.sendKeys(first);
		txtboxLasttName.sendKeys(last);
		txtboxPassword.sendKeys(password);
	}
	
	public void setTextBOD (String day, String month, String year) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(txtDays));
		
		txtDays.click();
		txtDays.sendKeys(Keys.chord(Keys.CONTROL + "1", day));
		txtDays.sendKeys(day);
		
		txtMonth.click();
		txtMonth.sendKeys(Keys.chord(Keys.CONTROL + "a", month));
		txtMonth.sendKeys(month);
		
		txtYear.click();
		txtYear.sendKeys(Keys.chord(Keys.CONTROL + "1", year));
		txtYear.sendKeys(year);
		
		btnNews.click();
		btnOption.click();
		
	}
	
	public void formRegister2(String company, String address, String address2, String city) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(txtboxCompany));
		
		txtboxCompany.sendKeys(company);
		txtboxAddress.sendKeys(address);
		txtboxAddress2.sendKeys(address2);
		txtboxCity.sendKeys(city);
	}
	
	public void lstState (int selection) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(State));
		
		State.click();
		
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Keys> lstSequance = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequance.add(Keys.DOWN);
			
		}
		
		lstSequance.add(Keys.ENTER);
		CharSequence[] cs = lstSequance.toArray(new CharSequence[lstSequance.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void lstCountry (int selection) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Country));
		
		Country.click();
		
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<Keys> lstSequance = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequance.add(Keys.DOWN);
			
		}
		
		lstSequance.add(Keys.ENTER);
		CharSequence[] cs = lstSequance.toArray(new CharSequence[lstSequance.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void formRegister3(String zip, String other, String home, String mobile, String alias) {
		
		txtboxZip.sendKeys(zip);
		txtboxOther.sendKeys(other);
		txtboxHomePhone.sendKeys(home);
		txtboxMobile.sendKeys(mobile);
		txtboxAlias.sendKeys(alias);
	}
	
	public void Register() {
		
		btnRegister.click();
	}
	
}
