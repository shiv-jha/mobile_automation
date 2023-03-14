package com.browserstack.run_first_test;

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

	public static void main(String[] args) throws MalformedURLException {

		String USERNAME = "shivkumarjha1";
		String AUTOMATE_KEY = "LyXM39N8vFhyFefbbXcy";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "12");
		capabilities.setCapability("device", "iPhone 7");
		capabilities.setCapability("app", "bs://4e5c7484b2c119bbb0b3d74f50103af9709fa50e");
		capabilities.setCapability("project", "IOS-Automation");
		capabilities.setCapability("build", "IOS 1.1");
		capabilities.setCapability("name", "First IOS App");
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver = new IOSDriver(new URL(URL), capabilities);
		
		Utilities.clickElementWithAccessiblityID(appiumDriver,"Text Button");
		Utilities.setTextWithAccessiblityID(appiumDriver,"Text Input","hello@browserstack.com\n");
		
		IOSElement textOutput = (IOSElement) new WebDriverWait(appiumDriver, 30).until(
			        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
		new WebDriverWait(appiumDriver, 30).until(
		        ExpectedConditions.textToBePresentInElementLocated(MobileBy.AccessibilityId("Text Output"), "hello@browserstack.com"));
		System.out.println(textOutput.getText());
		appiumDriver.quit();
	}
	
	

}
