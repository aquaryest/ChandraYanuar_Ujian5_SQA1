package com.sqa.ujian5.main;

import org.openqa.selenium.WebDriver;

import com.sqa.ujian5.driver.DriverSingleton;
import com.sqa.ujian5.elements.CreateAccount;

public class MainApp {

	public static void main(String[] args) {
		
		WebDriver driver = DriverSingleton.getInstance().getDriver();		
		driver.get("http://automationpractice.com/index.php");
		
		CreateAccount element = new CreateAccount();
		element.menuSignIn();
		element.formCreateEmail("user@phptravels.com");
		
		element.setGender(1);
		
		element.formRegister("Alea", "Lia", "roseflower");
		element.setTextBOD("11", "January", "1991");
		
		element.formRegister2("Exia", "Diatas Langit", "Dibawah Galaxy", "Bintang Andromeda 2");
		
		element.lstState(11);
		element.lstCountry(1);
		
		element.formRegister3("15697", "To Infinite an Beyond", "(0110)10110110111", "011000110111", "Dark Thunder Empress");
		
		element.Register();
	}
}
