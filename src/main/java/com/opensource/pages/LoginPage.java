package com.opensource.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class LoginPage extends Base {

	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Objects
	By txtUsername = By.xpath("//input[@id='txtUsername']");
	By txtPassword = By.xpath("//input[@id='txtPassword']");
	By btnLogin = By.xpath("//input[@id='btnLogin']");
	By lnkWelcome = By.xpath("//a[@id='welcome']");
	By lnkLogout = By.xpath("//a[contains(text(), 'Logout')]");

	// Methods
	/*
	 * Login OrangeHRM
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */
	public void loginOrange(String username, String password) {
		reporter("Enter Username and Password");
		type(txtUsername, username);
		type(txtPassword, password);
		takeScreenshot("enterUserPwd");
		click(btnLogin);
		implicitlyWait();
	}

	/*
	 * Logout OrangeHRM
	 * 
	 * @author Cristian Cossio
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */
	public void logoutOrange() {
		reporter("Logout Orange HRM Portal...");
		click(lnkWelcome);
		click(lnkLogout);
		implicitlyWait();
		takeScreenshot("logout");
		closeBrowser();
	}

}