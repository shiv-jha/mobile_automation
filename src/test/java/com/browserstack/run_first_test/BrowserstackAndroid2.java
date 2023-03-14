package com.browserstack.run_first_test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserstackAndroid2 {
	public static AndroidDriver appiumDriver;

	public static void main(String[] args) throws MalformedURLException {

		String USERNAME = "shivkumarjha1";
		String AUTOMATE_KEY = "LyXM39N8vFhyFefbbXcy";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "9.0");
		capabilities.setCapability("device", "Google Pixel 3");
		//capabilities.setCapability("app", "bs://045f2cff443cc431c4b721ac5699df78dbb4892c");
		capabilities.setCapability("app", "bs://751438e5461980af5e19dff33884c34ae353e392");
		capabilities.setCapability("project", "Wikipedia");
		capabilities.setCapability("build", "Build 1.2");
		capabilities.setCapability("name", "wikipedia search test test");
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver = new AndroidDriver(new URL(URL), capabilities);
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header")).click();
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Broserstack");
		String sEnteredtext=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		System.out.println(sEnteredtext);
		//appiumDriver.findElement(MobileBy.AccessibilityId(""));
		WebDriverWait wait = new WebDriverWait(appiumDriver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("org.wikipedia.alpha:id/search_close_btn")));
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_close_btn")).click();
		String sClearedtext=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		System.out.println(sClearedtext);

		
		
		
		
		
		
/*		
		
		
		AndroidElement searchElement = (AndroidElement) new WebDriverWait(appiumDriver, 30).until(
		 ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
			    searchElement.click();
			  
			    AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(appiumDriver, 30).until(
			        ExpectedConditions.elementToBeClickable(MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
			    insertTextElement.sendKeys("BrowserStack");
	*/	
		appiumDriver.quit();

	}

}
