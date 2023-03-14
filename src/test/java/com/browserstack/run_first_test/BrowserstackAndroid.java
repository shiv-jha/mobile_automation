package com.browserstack.run_first_test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BrowserstackAndroid {
	public static AndroidDriver appiumDriver;

	public static void main(String[] args) throws MalformedURLException {

		String USERNAME = "shivkumarjha1";
		String AUTOMATE_KEY = "LyXM39N8vFhyFefbbXcy";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("os_version", "9.0");
		capabilities.setCapability("device", "Google Pixel 3");
		capabilities.setCapability("app", "bs://4bb05a8aa052a23be56da882ef00b0cf55130e29");
		capabilities.setCapability("project", "Training");
		capabilities.setCapability("build", "Build 1.1");
		capabilities.setCapability("name", "Login test");
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver = new AndroidDriver(new URL(URL), capabilities);
		MobileElement element= (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
		String sText = element.getText();
		element.click();
		appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"7. Fragment\"]")).click();
		int getAllfragmentCount=appiumDriver.findElements(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout"))
				.size();
		System.out.println("text displayed is " + sText);
		System.out.println("total number of fragments are:"+getAllfragmentCount);
		
		appiumDriver.quit();

	}

}
