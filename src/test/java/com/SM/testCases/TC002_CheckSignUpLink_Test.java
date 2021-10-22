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

public class TC002_CheckSignUpLink_Test extends BaseClass {

//	//1
//	public WebDriver driver;
//		
//	//2
//	@BeforeClass
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver =  new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=megamenu&ut_source=homepage&ut_source3=megamenu");
//	}
	
	//3
	@Test
	public void checkSignUpLinkTest() throws IOException {
		logger.info("*****Executing checkSignUpLinkTest*****");
		LoginPage lp = new LoginPage(driver);
		logger.info("*****Web Driver is initiated*****");
		String actVal = lp.getSignUpLinkText();
		logger.info("*****Check that SignUp link is present*****");
		
		//Capturing the screenshot
		capturescreen(driver, "Check Sign Up Link");
				
		org.testng.Assert.assertEquals(actVal, "Sign Up", "Sign Up link is missing");
		logger.info("*****Sign Up Link is present*****");
	}
	
//	//4
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
