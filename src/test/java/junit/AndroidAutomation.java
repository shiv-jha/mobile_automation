package junit;



import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

class AndroidAutomation {
	public  AndroidDriver appiumDriver;

	@BeforeClass
	void setUp() throws MalformedURLException {
		String USERNAME = "shivjha_dIk7Zz";
		String AUTOMATE_KEY = "VaWJ7jYX8cV6uBSybt9T";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "11.0");
		capabilities.setCapability("device", "Samsung Galaxy S21 Ultra");
		capabilities.setCapability("app", "bs://cd71c16062fab9a3fa26206b5259dd1f74fd0845");
		capabilities.setCapability("project", "Wikipedia");
		capabilities.setCapability("build", "Build 1.2");
		capabilities.setCapability("name", "wikipedia search test");
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver = new AndroidDriver(new URL(URL), capabilities);
	}
	
	@Test
	void test1Search() throws MalformedURLException {
		
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header")).click();
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Broserstack");
		WebDriverWait wait =new WebDriverWait(appiumDriver, 30);
		String enteredText=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		assertEquals("Broserstack", enteredText);
	}
	
	@Test
	void test2Clear() throws MalformedURLException {
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_close_btn")).click();
		String clearedText=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		assertEquals("Search...", clearedText);		
	}
	
	@AfterClass
	void tearDown() {
		appiumDriver.quit();
	}

}
