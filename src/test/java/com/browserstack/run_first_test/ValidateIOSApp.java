package com.browserstack.run_first_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Utilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

class ValidateIOSApp {

	public static IOSDriver appiumDriver;
	private static String USERNAME = "shivkumarjha1";
	private static String AUTOMATE_KEY = "LyXM39N8vFhyFefbbXcy";
	static DesiredCapabilities capabilities;
	static String URL;

	@BeforeAll
	public  static void  setup()  {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "12");
		capabilities.setCapability("device", "iPhone 7");
		capabilities.setCapability("app", "bs://4e5c7484b2c119bbb0b3d74f50103af9709fa50e");
		capabilities.setCapability("project", "IOS-Automation");
		capabilities.setCapability("build", "IOS 1.1");
		capabilities.setCapability("name", "First IOS App");
		URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";	
	}
	
	@Test
	void testIOSApp() throws MalformedURLException {
		appiumDriver = new IOSDriver(new URL(URL), capabilities);
		Utilities.clickElementWithAccessiblityID(appiumDriver, "Text Button");
		Utilities.setTextWithAccessiblityID(appiumDriver, "Text Input", "hello@browserstack.com\n");
		IOSElement textOutput = (IOSElement) new WebDriverWait(appiumDriver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
		new WebDriverWait(appiumDriver, 30).until(ExpectedConditions
				.textToBePresentInElementLocated(MobileBy.AccessibilityId("Text Output"), "hello@browserstack.com"));
		assertEquals("hello@browserstack.com", textOutput.getText());
	}

	@AfterAll
	public static void closeBrowser() {
		appiumDriver.quit();
	}

}
