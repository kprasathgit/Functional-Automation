package com.refine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPageObject {

	WebDriver driver;

	public FacebookPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By fbusername = By.cssSelector("#email");
	By fbpassword = By.xpath("//input[@id='pass']");
	By fblogin = By.cssSelector("button[name='login']");
	By fbforgottenpassword = By.linkText("Forgotten password?");

	public WebElement getUsername() {
		return driver.findElement(fbusername);
	}

	public WebElement getPassWord() {
		return driver.findElement(fbpassword);

	}

	public WebElement getLoginButton() {
		return driver.findElement(fblogin);

	}

	public WebElement getForottonPassword() {
		return driver.findElement(fbforgottenpassword);

	}
}
