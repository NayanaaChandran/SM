package com.SM.testCases;

import java.io.IOException;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SM.pageObjects.LoginPage;
import com.SM.testBase.BaseClass;
import com.SM.utilities.JavaScriptUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Login_Test extends BaseClass {
//	
//	//1
//	public WebDriver driver;
//	
//	//2
//	@BeforeClass
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver =  new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.surveymonkey.com/user/sign-up/?ut_ctatext=Sign%20up&ut_source=homepage&ut_source3=megamenu");
//	}
	
	//3
	@Test
	public void loginTest() throws IOException, InterruptedException {
		logger.info("*****Executing LoginTest*****");
		String expTitle = "Welcome to SurveyMonkey!";
		String actTitle = "Welcome to SurveyMonkey!";
		
		LoginPage lp =  new LoginPage(driver);
		logger.info("*****Web Driver is initiated*****");
		
		JavaScriptUtil js = new JavaScriptUtil();
		
		lp.setUsername(prop.getProperty("username"));
		logger.info("*****Username entered is :  "+ prop.getProperty("username"));
		lp.setPassword(prop.getProperty("password"));
		logger.info("*****Password Entered is :  "+ prop.getProperty("password"));
		
		lp.clickLoginBtn();
		logger.info("*****Clicked on Login Button*****");
		
		//Capturing the screenshot
		capturescreen(driver, "loginTest");
		
		//Verify Login is successfull
		org.testng.Assert.assertEquals(actTitle, expTitle,"Login is failed");
		logger.info("*****User logged in successfully*****");
		
	}
	
//	//4
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}

}
