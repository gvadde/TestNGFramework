package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	

//	public void setup() {
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//	}
	@FindBy(id="txtUsername") WebElement Username;
	@FindBy(id="txtPassword") WebElement Password;
	@FindBy(id="btnLogin") WebElement login;
	
	public String validateTitle() {

		return driver.getTitle();
		}

	public DashboardPage validateLogin(String username,String password) {
	    Username.sendKeys(username);
	    Password.sendKeys(password);
		login.click();
		return new DashboardPage();
	}
		
	}
//	public void teardown() {
//		driver.quit();
//		}


	
     
	