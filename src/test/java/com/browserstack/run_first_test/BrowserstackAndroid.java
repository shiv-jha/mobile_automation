package com.browserstack.run_first_test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BrowserstackAndroid {
	
	public static AndroidDriver appiumDriver;

	public static void main(String[] args) throws MalformedURLException {

		
		
		
		//create a java or a maven project
	//	if java project convert to maven project
//		go to pom.xml
//		create one tag <dependencies> add all what i pinged in last chat
//		run as mvn install
//		copy yr class in this project and run it
		
		
		

		String USERNAME = "shivjha_dIk7Zz";  //email- katya.shiv@gmail.com	
		String AUTOMATE_KEY = "VaWJ7jYX8cV6uBSybt9T";
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("os_version", "9.0");
		cap.setCapability("device", "Google Pixel 3");
		cap.setCapability("app", "bs://80dc6f16b06b14d8ed61ca8b199fa448d02c1bf6");
		cap.setCapability("project", "Training-IBM-oct-batch");
		cap.setCapability("build", "Build 1.3");
		cap.setCapability("name", "Demo App Test");
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		appiumDriver = new AndroidDriver(new URL(URL), cap);
		MobileElement pref= (MobileElement)appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
		System.out.println("pref element text is :"+ pref.getText());
		pref.click();
		
		appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"7. Fragment\"]")).click();
		
		List<MobileElement> allSegment = appiumDriver.findElements(By.xpath("//android.widget.ListView/android.widget.LinearLayout"));
		System.out.println("no of fragment is:"+allSegment.size());
		for(int i=1;i<=allSegment.size();i++) {
			String sText=appiumDriver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout["+i+"]//android.widget.TextView")).getText();
			System.out.println(sText);
		}
		appiumDriver.quit();
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	MobileElement pref= (MobileElement)appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]"));
		String displayedText=pref.getText();
		System.out.println(displayedText);
		pref.click();
		appiumDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"7. Fragment\"]")).click();
		List<MobileElement> allSegment = appiumDriver.findElements(By.xpath("//android.widget.ListView/android.widget.LinearLayout"));
		System.out.println("count of segment is "+allSegment.size());
		for(int i=1;i<allSegment.size();i++) {
			appiumDriver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout["+i+"]//android.widget.TextView")).getText();
		}
	
		*/
		
			
		
//		appiumDriver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	/*	
		
		
		
		
		//String USERNAME = "shivkumarjha1";
		//String AUTOMATE_KEY = "";
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
*/
	}

}
