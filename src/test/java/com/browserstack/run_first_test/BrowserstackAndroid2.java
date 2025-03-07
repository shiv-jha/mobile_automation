package com.browserstack.run_first_test;

import static org.testng.Assert.assertEquals;

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

		String USERNAME = "shivjha_dIk7Zz";
		String AUTOMATE_KEY = "VaWJ7jYX8cV6uBSybt9T";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "11.0");
		capabilities.setCapability("device", "Samsung Galaxy S21 Ultra");
		capabilities.setCapability("app", "bs://1ff54d6996f3b96431b0232d6dcda8ceed8584d6");
		//capabilities.setCapability("app", "bs://4efac4b77549d987c76ecdca0c121aa8bad214aa");
		capabilities.setCapability("project", "Wikipedia");
		capabilities.setCapability("build", "Build 1.1");
		capabilities.setCapability("name", "wikipedia search test");
		
		
		//Thread.sleep
		
		
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver = new AndroidDriver(new URL(URL), capabilities);
		
		appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header")).click();
		
		WebDriverWait wait=new WebDriverWait(appiumDriver, 30);
		wait.until(ExpectedConditions.visibilityOf(appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text"))));
		
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Broserstack");
		String enteredText=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		assertEquals(enteredText, "Broserstack");
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_close_btn")).click();
		enteredText=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		System.out.println("after clearing the field"+enteredText);
		assertEquals(enteredText, "Search…");
		appiumDriver.quit();
		
		
		
		
		
		
		
		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/fragment_feed_header")).click();
//		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Broserstack");
//		WebDriverWait wait =new WebDriverWait(appiumDriver, 30);
//		//wait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_close_btn"))));
//		String enteredText=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
//		System.out.println("entered text is "+enteredText);
//		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_close_btn")).click();
//		String clearedText=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
//		
//		System.out.println(clearedText);
//		appiumDriver.quit();
	
		
		

		/*
		
		
		
		
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
		
		appiumDriver.quit();*/

	}

}
