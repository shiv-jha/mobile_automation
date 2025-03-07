package com.browserstack.run_first_test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Utilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BrowserstackIOS {
	public static IOSDriver appiumDriver;
	//public static String inputText="Appium";

	public static void setup() throws MalformedURLException {
		
	}
	
	public static void main(String[] args) throws MalformedURLException {

		
		
		String USERNAME = "shivjha_dIk7Zz";
		String AUTOMATE_KEY = "VaWJ7jYX8cV6uBSybt9T";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "14");
		capabilities.setCapability("device", "iPhone 11");
		capabilities.setCapability("app", "bs://690d847ba9fd6c43ae73df2e1c0e2749ec703f79");
		capabilities.setCapability("project", "IOS-Automation");
		capabilities.setCapability("build", "IOS 1.1");
		capabilities.setCapability("name", "First IOS App");
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver = new IOSDriver(new URL(URL), capabilities);
		
		
		Utilities.clickElementWithAccessiblityID(appiumDriver, "Text Button");
		Utilities.setTextWithAccessiblityID(appiumDriver, "Text Input", "Sample test");
		
		Utilities.clickElementWithAccessiblityID(appiumDriver, "Return");
		Utilities.verifytextPresentWithAccessiblityID(appiumDriver, "Text Output", "Sample test");
		
		/*appiumDriver.findElementByAccessibilityId("Text Button").click();
		appiumDriver.findElementByAccessibilityId("Text Input").sendKeys("Sample test");
		appiumDriver.findElementByAccessibilityId("Return").click();
		String outputText=appiumDriver.findElementByAccessibilityId("Text Output").getAttribute("value");
		assertEquals("Sample test", outputText);
		*/
		appiumDriver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Utilities.clickElementWithAccessiblityID(appiumDriver, "Text Button");
//		Utilities.setTextWithAccessiblityID(appiumDriver, "Text Input", inputText);
//		Utilities.clickElementWithAccessiblityID(appiumDriver, "Return");
//		Utilities.verifytextPresentWithAccessiblityID(appiumDriver, "Text Output", inputText);
//		appiumDriver.quit();

		
		
		
		
		
		
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Utilities.clickElementWithAccessiblityID(appiumDriver,"Text Button");
		 * Utilities.setTextWithAccessiblityID(appiumDriver,"Text Input"
		 * ,"hello@browserstack.com\n");
		 * 
		 * IOSElement textOutput = (IOSElement) new WebDriverWait(appiumDriver,
		 * 30).until( ExpectedConditions.elementToBeClickable(MobileBy.
		 * AccessibilityId("Text Output"))); new WebDriverWait(appiumDriver, 30).until(
		 * ExpectedConditions.textToBePresentInElementLocated(MobileBy.
		 * AccessibilityId("Text Output"), "hello@browserstack.com"));
		 * System.out.println(textOutput.getText()); appiumDriver.quit();
		 */
	}

}
